package com.masonvanmeurs;
import java.io.File;
import java.io.IOException;

public class Main
{
    public static void main(String[] argv) throws IOException
    {
        String folder_path = "P:\\plexuser\\Movies\\Baby Driver";
        String new_file_name = "Baby.Driver.2017.2160p.BluRay.REMUX.HEVC.DTS-HD.MA.TrueHD.7.1.Atmos-FGT.part";

        File myfolder = new File(folder_path);
        File[] file_array = myfolder.listFiles();
        for (int i = 0; i < file_array.length; i++)
        {
            if (file_array[i].isFile())
            {
                File myfile = new File(folder_path + "\\" + file_array[i].getName());

                String number_part = file_array[i].getName().substring(76);
                String rename_name = folder_path + "\\" + new_file_name + number_part + ".rar";

                myfile.renameTo(new File(rename_name));
            }
        }
    }
}