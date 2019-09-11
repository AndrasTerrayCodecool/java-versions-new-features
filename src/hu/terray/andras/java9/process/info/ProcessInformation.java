package hu.terray.andras.java9.process.info;

import java.time.Duration;
import java.time.Instant;
import java.util.Optional;

public class ProcessInformation {
    public static void main(String[] args) {
        ProcessHandle self = ProcessHandle.current();
        long PID = self.pid();

        ProcessHandle.Info procInfo = self.info();

        Optional<String[]> arguments = procInfo.arguments();
        System.out.println(arguments.get()[0]);

        Optional<String> cmd =  procInfo.commandLine();
        System.out.println(cmd);

        Optional<Instant> startTime = procInfo.startInstant();
        System.out.println(startTime);

        Optional<Duration> cpuUsage = procInfo.totalCpuDuration();
        System.out.println(cpuUsage);
    }
}
