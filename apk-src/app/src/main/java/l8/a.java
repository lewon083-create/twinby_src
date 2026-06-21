package l8;

import android.content.Context;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import x2.g;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List f28058b = Arrays.asList("FNumber", "ExposureTime", "ISOSpeedRatings", "GPSAltitude", "GPSAltitudeRef", "FocalLength", "GPSDateStamp", "WhiteBalance", "GPSProcessingMethod", "GPSTimeStamp", "DateTime", "Flash", "GPSLatitude", "GPSLatitudeRef", "GPSLongitude", "GPSLongitudeRef", "Make", "Model");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f28059a;

    public a(String str) {
        this.f28059a = new g(str);
    }

    public final ByteArrayOutputStream a(Context context, ByteArrayOutputStream byteArrayOutputStream) {
        FileInputStream fileInputStream;
        Exception e3;
        FileOutputStream fileOutputStream;
        try {
            String string = UUID.randomUUID().toString();
            File file = new File(context.getCacheDir(), string + ".jpg");
            fileOutputStream = new FileOutputStream(file);
            try {
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                int i = pl.a.f31524a;
                if (byteArray != null) {
                    fileOutputStream.write(byteArray);
                }
                fileOutputStream.close();
                g gVar = new g(file.getAbsolutePath());
                g gVar2 = this.f28059a;
                for (String str : f28058b) {
                    if (gVar2.c(str) != null) {
                        gVar.G(str, gVar2.c(str));
                    }
                }
                try {
                    gVar.C();
                } catch (IOException unused) {
                }
                gVar.C();
                fileOutputStream.close();
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                fileInputStream = new FileInputStream(file);
                try {
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int i10 = fileInputStream.read(bArr);
                        if (-1 == i10) {
                            fileInputStream.close();
                            return byteArrayOutputStream2;
                        }
                        byteArrayOutputStream2.write(bArr, 0, i10);
                    }
                } catch (Exception e7) {
                    e3 = e7;
                    Log.e("ExifDataCopier", "Error preserving Exif data on selected image: " + e3);
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException e10) {
                            e10.printStackTrace();
                        }
                    }
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e11) {
                            e11.printStackTrace();
                        }
                    }
                    return byteArrayOutputStream;
                }
            } catch (Exception e12) {
                fileInputStream = null;
                e3 = e12;
            }
        } catch (Exception e13) {
            fileInputStream = null;
            e3 = e13;
            fileOutputStream = null;
        }
    }

    public a(byte[] bArr) {
        this.f28059a = new g(new ByteArrayInputStream(bArr));
    }
}
