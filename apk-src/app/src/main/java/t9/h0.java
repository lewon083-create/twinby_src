package t9;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.media.AudioManager;
import android.os.Process;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.webkit.CookieManager;
import com.google.android.gms.internal.ads.d00;
import com.google.android.gms.internal.ads.k00;
import com.google.android.gms.internal.ads.ph0;
import com.google.android.gms.internal.ads.si;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class h0 implements x9.b, ya.c, z3.s {
    public static void b(x2.g gVar, x2.g gVar2) {
        for (String str : Arrays.asList("ImageDescription", "Make", "Model", "Software", "DateTime", "Artist", "Copyright", "ExposureTime", "FNumber", "ExposureProgram", "SpectralSensitivity", "PhotographicSensitivity", "ISOSpeedRatings", "OECF", "SensitivityType", "StandardOutputSensitivity", "RecommendedExposureIndex", "ISOSpeed", "ISOSpeedLatitudeyyy", "ISOSpeedLatitudezzz", "ExifVersion", "DateTimeOriginal", "DateTimeDigitized", "OffsetTime", "OffsetTimeOriginal", "OffsetTimeDigitized", "ShutterSpeedValue", "ApertureValue", "BrightnessValue", "ExposureBiasValue", "MaxApertureValue", "SubjectDistance", "MeteringMode", "LightSource", "Flash", "FocalLength", "MakerNote", "UserComment", "SubSecTime", "SubSecTimeOriginal", "SubSecTimeDigitized", "FlashpixVersion", "FlashEnergy", "SpatialFrequencyResponse", "FocalPlaneXResolution", "FocalPlaneYResolution", "FocalPlaneResolutionUnit", "ExposureIndex", "SensingMethod", "FileSource", "SceneType", "CFAPattern", "CustomRendered", "ExposureMode", "WhiteBalance", "DigitalZoomRatio", "FocalLengthIn35mmFilm", "SceneCaptureType", "GainControl", "Contrast", "Saturation", "Sharpness", "DeviceSettingDescription", "SubjectDistanceRange", "ImageUniqueID", "CameraOwnerName", "BodySerialNumber", "LensSpecification", "LensMake", "LensModel", "LensSerialNumber", "GPSVersionID", "GPSLatitudeRef", "GPSLatitude", "GPSLongitudeRef", "GPSLongitude", "GPSAltitudeRef", "GPSAltitude", "GPSTimeStamp", "GPSSatellites", "GPSStatus", "GPSMeasureMode", "GPSDOP", "GPSSpeedRef", "GPSSpeed", "GPSTrackRef", "GPSTrack", "GPSImgDirectionRef", "GPSImgDirection", "GPSMapDatum", "GPSDestLatitudeRef", "GPSDestLatitude", "GPSDestLongitudeRef", "GPSDestLongitude", "GPSDestBearingRef", "GPSDestBearing", "GPSDestDistanceRef", "GPSDestDistance", "GPSProcessingMethod", "GPSAreaInformation", "GPSDateStamp", "GPSDifferential", "GPSHPositioningError", "InteroperabilityIndex", "Orientation")) {
            if (gVar.c(str) != null) {
                gVar2.G(str, gVar.c(str));
            }
        }
        gVar2.C();
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0045, code lost:
    
        if (java.lang.Character.isHighSurrogate(r5) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0082, code lost:
    
        if (java.lang.Character.isLowSurrogate(r5) != false) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x006c A[EDGE_INSN: B:92:0x006c->B:46:0x006c BREAK  A[LOOP:2: B:47:0x006e->B:58:0x0085], EDGE_INSN: B:93:0x006c->B:46:0x006c BREAK  A[LOOP:2: B:47:0x006e->B:58:0x0085, LOOP_LABEL: LOOP:2: B:47:0x006e->B:58:0x0085]] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00a2 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean g(w2.b r7, android.text.Editable r8, int r9, int r10, boolean r11) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t9.h0.g(w2.b, android.text.Editable, int, int, boolean):boolean");
    }

    public static CookieManager i() {
        p9.k kVar = p9.k.C;
        g0 g0Var = kVar.f31297c;
        int iMyUid = Process.myUid();
        if (iMyUid != 0 && iMyUid != 1000) {
            try {
                return CookieManager.getInstance();
            } catch (Throwable th2) {
                u9.i.f("Failed to obtain CookieManager.", th2);
                kVar.f31302h.e("ApiLevelUtil.getCookieManager", th2);
            }
        }
        return null;
    }

    @Override // z3.s
    public m4.p a(z3.o oVar, z3.l lVar) {
        return new z3.r(oVar, lVar);
    }

    public void c(yi.b bVar) {
        Log.e("IN_APP_PURCHASE", "onBillingServiceDisconnected handler error: " + bVar);
    }

    @Override // ya.c
    public com.google.android.gms.internal.ads.j0 d(Context context, String str, ya.b bVar) {
        com.google.android.gms.internal.ads.j0 j0Var = new com.google.android.gms.internal.ads.j0();
        int iC = bVar.c(context, str);
        j0Var.f6666a = iC;
        if (iC != 0) {
            j0Var.f6668c = -1;
            return j0Var;
        }
        int iB = bVar.b(context, str, true);
        j0Var.f6667b = iB;
        if (iB != 0) {
            j0Var.f6668c = 1;
        }
        return j0Var;
    }

    @Override // z3.s
    public m4.p e() {
        return new z3.r(z3.o.f46131l, null);
    }

    public Signature[] f(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    public boolean h(CharSequence charSequence) {
        return charSequence instanceof e2.d;
    }

    public k00 j(d00 d00Var, si siVar, boolean z5, ph0 ph0Var) {
        return new k00(d00Var, siVar, z5, ph0Var);
    }

    public int k(Context context, TelephonyManager telephonyManager) {
        return 3;
    }

    public boolean m(Context context) {
        return false;
    }

    public Intent n(Activity activity) {
        Intent intent = new Intent();
        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        intent.putExtra("app_package", activity.getPackageName());
        intent.putExtra("app_uid", activity.getApplicationInfo().uid);
        return intent;
    }

    public int p(AudioManager audioManager) {
        return 0;
    }

    public int q(Context context) {
        return ((TelephonyManager) context.getSystemService("phone")).getNetworkType();
    }

    public void l(Context context) {
    }

    public void o(Activity activity) {
    }
}
