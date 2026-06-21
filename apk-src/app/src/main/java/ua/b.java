package ua;

import android.app.AppOpsManager;
import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import ma.j;
import ma.k;
import pa.c0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f34402a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final char[] f34403b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Boolean f34404c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Boolean f34405d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Boolean f34406e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Boolean f34407f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static Boolean f34408g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static Boolean f34409h;
    public static String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f34410j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static Boolean f34411k;

    public static void a(Context context, Throwable th2) {
        try {
            c0.i(context);
        } catch (Exception e3) {
            Log.e("CrashUtils", "Error adding exception to DropBox!", e3);
        }
    }

    public static String b(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length + length];
        int i10 = 0;
        for (byte b2 : bArr) {
            char[] cArr2 = f34403b;
            cArr[i10] = cArr2[(b2 & 255) >>> 4];
            cArr[i10 + 1] = cArr2[b2 & 15];
            i10 += 2;
        }
        return new String(cArr);
    }

    public static String c(byte[] bArr) {
        int length = bArr.length;
        StringBuilder sb2 = new StringBuilder(length + length);
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = (bArr[i10] & 240) >>> 4;
            char[] cArr = f34402a;
            sb2.append(cArr[i11]);
            sb2.append(cArr[bArr[i10] & 15]);
        }
        return sb2.toString();
    }

    public static void d(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static long e(InputStream inputStream, OutputStream outputStream, boolean z5) {
        byte[] bArr = new byte[1024];
        long j10 = 0;
        while (true) {
            try {
                int i10 = inputStream.read(bArr, 0, 1024);
                if (i10 == -1) {
                    break;
                }
                j10 += (long) i10;
                outputStream.write(bArr, 0, i10);
            } catch (Throwable th2) {
                if (z5) {
                    d(inputStream);
                    d(outputStream);
                }
                throw th2;
            }
        }
        if (z5) {
            d(inputStream);
            d(outputStream);
        }
        return j10;
    }

    public static String f() throws Throwable {
        BufferedReader bufferedReader;
        if (i == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                i = Application.getProcessName();
            } else {
                int iMyPid = f34410j;
                if (iMyPid == 0) {
                    iMyPid = Process.myPid();
                    f34410j = iMyPid;
                }
                String strTrim = null;
                strTrim = null;
                strTrim = null;
                BufferedReader bufferedReader2 = null;
                if (iMyPid > 0) {
                    try {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(iMyPid).length() + 14);
                        sb2.append("/proc/");
                        sb2.append(iMyPid);
                        sb2.append("/cmdline");
                        String string = sb2.toString();
                        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            bufferedReader = new BufferedReader(new FileReader(string));
                            try {
                                String line = bufferedReader.readLine();
                                c0.i(line);
                                strTrim = line.trim();
                            } catch (IOException unused) {
                            } catch (Throwable th2) {
                                th = th2;
                                bufferedReader2 = bufferedReader;
                                d(bufferedReader2);
                                throw th;
                            }
                        } finally {
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        }
                    } catch (IOException unused2) {
                        bufferedReader = null;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                    d(bufferedReader);
                }
                i = strTrim;
            }
        }
        return i;
    }

    public static byte[] g(Context context, String str) {
        MessageDigest messageDigest;
        PackageInfo packageInfoD = wa.b.a(context).d(64, str);
        Signature[] signatureArr = packageInfoD.signatures;
        if (signatureArr != null && signatureArr.length == 1) {
            int i10 = 0;
            while (true) {
                if (i10 >= 2) {
                    messageDigest = null;
                    break;
                }
                try {
                    messageDigest = MessageDigest.getInstance("SHA1");
                } catch (NoSuchAlgorithmException unused) {
                }
                if (messageDigest != null) {
                    break;
                }
                i10++;
            }
            if (messageDigest != null) {
                return messageDigest.digest(packageInfoD.signatures[0].toByteArray());
            }
        }
        return null;
    }

    public static boolean h() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static boolean i() {
        return Build.VERSION.SDK_INT >= 30;
    }

    public static boolean j(Context context, int i10) {
        if (n(context, "com.google.android.gms", i10)) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.android.gms", 64);
                k kVarB = k.b(context);
                kVarB.getClass();
                if (packageInfo != null) {
                    if (!k.d(packageInfo, false)) {
                        if (k.d(packageInfo, true)) {
                            if (!j.b(kVarB.f28783b)) {
                                Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
                            }
                        }
                    }
                    return true;
                }
                return false;
            } catch (PackageManager.NameNotFoundException unused) {
                if (Log.isLoggable("UidVerifier", 3)) {
                    Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
                }
            }
        }
        return false;
    }

    public static boolean k(Context context) {
        if (f34406e == null) {
            PackageManager packageManager = context.getPackageManager();
            boolean z5 = false;
            if (packageManager.hasSystemFeature("com.google.android.feature.services_updater") && packageManager.hasSystemFeature("cn.google.services")) {
                z5 = true;
            }
            f34406e = Boolean.valueOf(z5);
        }
        return f34406e.booleanValue();
    }

    public static boolean l(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f34404c == null) {
            f34404c = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        f34404c.booleanValue();
        if (o(context)) {
            return !h() || i();
        }
        return false;
    }

    public static byte[] m(String str) {
        int length = str.length();
        if (length % 2 != 0) {
            throw new IllegalArgumentException("Hex string has odd number of characters");
        }
        byte[] bArr = new byte[length / 2];
        int i10 = 0;
        while (i10 < length) {
            int i11 = i10 + 2;
            bArr[i10 / 2] = (byte) Integer.parseInt(str.substring(i10, i11), 16);
            i10 = i11;
        }
        return bArr;
    }

    public static boolean n(Context context, String str, int i10) {
        ti.b bVarA = wa.b.a(context);
        bVarA.getClass();
        try {
            AppOpsManager appOpsManager = (AppOpsManager) bVarA.f33798b.getSystemService("appops");
            if (appOpsManager == null) {
                throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
            }
            appOpsManager.checkPackage(i10, str);
            return true;
        } catch (SecurityException unused) {
            return false;
        }
    }

    public static boolean o(Context context) {
        if (f34405d == null) {
            f34405d = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return f34405d.booleanValue();
    }
}
