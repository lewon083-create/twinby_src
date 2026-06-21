package t;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.util.Range;
import android.util.Size;
import com.google.android.gms.internal.ads.zj0;
import g0.s2;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 implements g0.d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u.i f33003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z.d f33004c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public o f33006e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i0.p f33008g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final g0.a2 f33009h;
    public final zj0 i;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f33005d = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public i0.p f33007f = null;

    public d0(String str, u.p pVar) {
        str.getClass();
        this.f33002a = str;
        u.i iVarB = pVar.b(str);
        this.f33003b = iVarB;
        z.d dVar = new z.d();
        dVar.f45774a = this;
        this.f33004c = dVar;
        g0.a2 a2VarJ = j0.g.J(iVarB);
        this.f33009h = a2VarJ;
        this.i = new zj0(str, a2VarJ);
        this.f33008g = new i0.p(new a0.f(5, null));
    }

    @Override // g0.d0
    public final Set a() {
        return ((v.b) k6.t0.i(this.f33003b).f27180c).a();
    }

    @Override // g0.d0
    public final int c() {
        return n(0);
    }

    @Override // g0.d0
    public final boolean d() {
        int[] iArr = (int[]) this.f33003b.a(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES);
        if (iArr != null) {
            for (int i : iArr) {
                if (i == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // g0.d0
    public final String e() {
        return this.f33002a;
    }

    @Override // g0.d0
    public final List g(Range range) {
        Size[] highSpeedVideoSizesFor;
        try {
            highSpeedVideoSizesFor = ((StreamConfigurationMap) ((ni.i) this.f33003b.c().f2019c).f29407c).getHighSpeedVideoSizesFor(range);
        } catch (IllegalArgumentException e3) {
            com.google.android.gms.internal.auth.g.P("Camera2CameraInfo", "Can't get high speed resolutions for " + range, e3);
            highSpeedVideoSizesFor = null;
        }
        return highSpeedVideoSizesFor != null ? Arrays.asList(highSpeedVideoSizesFor) : Collections.EMPTY_LIST;
    }

    @Override // g0.d0
    public final Rect h() {
        Rect rect = (Rect) this.f33003b.a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        if ("robolectric".equals(Build.FINGERPRINT) && rect == null) {
            return new Rect(0, 0, 4000, 3000);
        }
        rect.getClass();
        return rect;
    }

    @Override // g0.d0
    public final k1 i() {
        synchronized (this.f33005d) {
            try {
                o oVar = this.f33006e;
                if (oVar == null) {
                    return new k1(this.f33003b);
                }
                return (k1) oVar.f33181l.f6314d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // g0.d0
    public final androidx.lifecycle.d0 j() {
        return this.f33008g;
    }

    @Override // g0.d0
    public final boolean k() {
        int[] iArr = (int[]) this.f33003b.a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        if (iArr != null) {
            for (int i : iArr) {
                if (i == 9) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // g0.d0
    public final int l() {
        Integer num = (Integer) this.f33003b.a(CameraCharacteristics.LENS_FACING);
        f2.g.a("Unable to get the lens facing of the camera.", num != null);
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            return 0;
        }
        if (iIntValue == 1) {
            return 1;
        }
        if (iIntValue == 2) {
            return 2;
        }
        com.google.android.gms.internal.auth.g.O("LensFacingUtil", "The given lens facing integer: " + iIntValue + " can not be recognized.");
        return -1;
    }

    @Override // g0.d0
    public final s2 m() {
        Integer num = (Integer) this.f33003b.a(CameraCharacteristics.SENSOR_INFO_TIMESTAMP_SOURCE);
        num.getClass();
        return num.intValue() != 1 ? s2.f19753b : s2.f19754c;
    }

    @Override // g0.d0
    public final int n(int i) {
        Integer num = (Integer) this.f33003b.a(CameraCharacteristics.SENSOR_ORIENTATION);
        num.getClass();
        return a0.e.i(a0.e.v(i), num.intValue(), 1 == l());
    }

    @Override // g0.d0
    public final Object o() {
        return (CameraCharacteristics) this.f33003b.f33962b.f28630b;
    }

    @Override // g0.d0
    public final g0.b1 p() {
        return this.i;
    }

    @Override // g0.d0
    public final List q() {
        Size[] highSpeedVideoSizes = ((StreamConfigurationMap) ((ni.i) this.f33003b.c().f2019c).f29407c).getHighSpeedVideoSizes();
        return highSpeedVideoSizes != null ? Arrays.asList(highSpeedVideoSizes) : Collections.EMPTY_LIST;
    }

    @Override // g0.d0
    public final g0.a2 r() {
        return this.f33009h;
    }

    @Override // g0.d0
    public final List s(int i) {
        Size[] sizeArrT = this.f33003b.c().t(i);
        return sizeArrT != null ? Arrays.asList(sizeArrT) : Collections.EMPTY_LIST;
    }

    @Override // g0.d0
    public final androidx.lifecycle.d0 t() {
        synchronized (this.f33005d) {
            try {
                o oVar = this.f33006e;
                if (oVar != null) {
                    i0.p pVar = this.f33007f;
                    if (pVar != null) {
                        return pVar;
                    }
                    return (androidx.lifecycle.d0) oVar.i.f6316f;
                }
                if (this.f33007f == null) {
                    m2 m2VarC = com.google.android.gms.internal.ads.i0.c(this.f33003b);
                    n2 n2Var = new n2(m2VarC.e(), m2VarC.k());
                    n2Var.e(1.0f);
                    this.f33007f = new i0.p(l0.a.e(n2Var));
                }
                return this.f33007f;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // g0.d0
    public final Set u() {
        HashSet hashSet = new HashSet();
        int[] iArr = (int[]) this.f33003b.a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        if (iArr != null) {
            for (int i : iArr) {
                hashSet.add(Integer.valueOf(i));
            }
        }
        return hashSet;
    }

    @Override // g0.d0
    public final Set v() {
        int[] outputFormats;
        ni.i iVar = (ni.i) this.f33003b.c().f2019c;
        iVar.getClass();
        try {
            outputFormats = ((StreamConfigurationMap) iVar.f29407c).getOutputFormats();
        } catch (IllegalArgumentException | NullPointerException e3) {
            com.google.android.gms.internal.auth.g.P("StreamConfigurationMapCompatBaseImpl", "Failed to get output formats from StreamConfigurationMap", e3);
            outputFormats = null;
        }
        int[] iArr = outputFormats != null ? (int[]) outputFormats.clone() : null;
        if (iArr == null) {
            return new HashSet();
        }
        HashSet hashSet = new HashSet();
        for (int i : iArr) {
            hashSet.add(Integer.valueOf(i));
        }
        return hashSet;
    }

    public final void w(o oVar) {
        synchronized (this.f33005d) {
            try {
                this.f33006e = oVar;
                i0.p pVar = this.f33007f;
                if (pVar != null) {
                    pVar.l((androidx.lifecycle.d0) oVar.i.f6316f);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Integer num = (Integer) this.f33003b.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        num.getClass();
        int iIntValue = num.intValue();
        com.google.android.gms.internal.auth.g.t("Camera2CameraInfo", "Device Level: " + (iIntValue != 0 ? iIntValue != 1 ? iIntValue != 2 ? iIntValue != 3 ? iIntValue != 4 ? l7.o.i(iIntValue, "Unknown value: ") : "INFO_SUPPORTED_HARDWARE_LEVEL_EXTERNAL" : "INFO_SUPPORTED_HARDWARE_LEVEL_3" : "INFO_SUPPORTED_HARDWARE_LEVEL_LEGACY" : "INFO_SUPPORTED_HARDWARE_LEVEL_FULL" : "INFO_SUPPORTED_HARDWARE_LEVEL_LIMITED"));
    }
}
