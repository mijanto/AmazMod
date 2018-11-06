package com.edotassi.amazmod.support;

import amazmod.com.transport.Constants;

public class ShellCommandHelper {

    public static String getApkInstall(String apkFilePath) {
        return String.format(Constants.SHELL_COMMAND_INSTALL_APK, apkFilePath);
    }

    public static String getForceStopHuamiLauncher() {
        return Constants.SHELL_COMMAND_FORCE_STOP_HUAMI_LAUNCHER;
    }

    public static String getReboot() {
        return Constants.SHELL_COMMAND_REBOOT;
    }

    public static String getRebootBootloader() {
        return Constants.SHELL_COMMAND_FASTBOOT;
    }

    public static String getMakeDirCommand(String path){
        return String.format(Constants.SHELL_COMMAND_MKDIR, path);
    }

    public static String getRenameCommand(String oldPath, String newPath){
        return String.format(Constants.SHELL_COMMAND_RENAME,oldPath,newPath);
    }

    public static String getCompressCommand(String path, String folder){
        String compressedFile = path + "/" + folder + ".tar.gz";
        return String.format(Constants.SHELL_COMMAND_COMPRESS, compressedFile, path, folder);
    }

    public static String getExtractCommand(String file, String destinationPath){
        return String.format(Constants.SHELL_COMMAND_EXTRACT, file, destinationPath);
    }

    public static String getRemoveRecursivelyCommand(String path){
        return String.format(Constants.SHELL_COMMAND_REMOVE_RECURSIVELY, path);
    }

    public static String getDPM() {
        return Constants.SHELL_COMMAND_DPM;
    }

    public static String getEnableAppsList() {
        return Constants.SHELL_COMMAND_ENABLE_APPS_LIST;
    }

    public static String getDisableAppsList() {
        return Constants.SHELL_COMMAND_DISABLE_APPS_LIST;
    }
}
