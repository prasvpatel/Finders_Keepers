package com.epicgames.ue4;

import com.YourCompany.E_Room.OBBDownloaderService;
import com.YourCompany.E_Room.DownloaderActivity;


public class DownloadShim
{
	public static OBBDownloaderService DownloaderService;
	public static DownloaderActivity DownloadActivity;
	public static Class<DownloaderActivity> GetDownloaderType() { return DownloaderActivity.class; }
}

