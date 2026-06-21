package g1;

import android.os.Build;
import android.util.Range;
import android.util.Size;
import androidx.camera.video.internal.compat.quirk.MediaCodecInfoReportIncorrectInfoQuirk;
import com.google.android.gms.internal.auth.g;
import e1.h0;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements h0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h0 f19823b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Range f19824c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Range f19825d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashSet f19826e;

    public b(h0 h0Var) {
        HashSet hashSet = new HashSet();
        this.f19826e = hashSet;
        this.f19823b = h0Var;
        int iC = h0Var.c();
        this.f19824c = Range.create(Integer.valueOf(iC), Integer.valueOf(((int) Math.ceil(4096.0d / ((double) iC))) * iC));
        int iL = h0Var.l();
        this.f19825d = Range.create(Integer.valueOf(iL), Integer.valueOf(((int) Math.ceil(2160.0d / ((double) iL))) * iL));
        hashSet.addAll(MediaCodecInfoReportIncorrectInfoQuirk.f1266a.contains(Build.MODEL.toLowerCase(Locale.US)) ? Collections.singleton(new Size(1920, 1080)) : Collections.EMPTY_SET);
    }

    public static h0 b(h0 h0Var, Size size) {
        if (!(h0Var instanceof b)) {
            if (c1.a.f2187a.i(MediaCodecInfoReportIncorrectInfoQuirk.class) != null) {
                h0Var = new b(h0Var);
            } else if (size != null && !h0Var.a(size.getWidth(), size.getHeight())) {
                g.O("VideoEncoderInfoWrapper", "Detected that the device does not support a size " + size + " that should be valid in widths/heights = " + h0Var.m() + "/" + h0Var.p());
                h0Var = new b(h0Var);
            }
        }
        if (size != null && (h0Var instanceof b)) {
            ((b) h0Var).f19826e.add(size);
        }
        return h0Var;
    }

    @Override // e1.h0
    public final int c() {
        return this.f19823b.c();
    }

    @Override // e1.h0
    public final Range d() {
        return this.f19823b.d();
    }

    @Override // e1.h0
    public final boolean f() {
        return this.f19823b.f();
    }

    @Override // e1.h0
    public final Range h(int i) {
        Integer numValueOf = Integer.valueOf(i);
        Range range = this.f19825d;
        boolean zContains = range.contains(numValueOf);
        h0 h0Var = this.f19823b;
        f2.g.a("Not supported height: " + i + " which is not in " + range + " or can not be divided by alignment " + h0Var.l(), zContains && i % h0Var.l() == 0);
        return this.f19824c;
    }

    @Override // e1.h0
    public final Range k(int i) {
        Integer numValueOf = Integer.valueOf(i);
        Range range = this.f19824c;
        boolean zContains = range.contains(numValueOf);
        h0 h0Var = this.f19823b;
        f2.g.a("Not supported width: " + i + " which is not in " + range + " or can not be divided by alignment " + h0Var.c(), zContains && i % h0Var.c() == 0);
        return this.f19825d;
    }

    @Override // e1.h0
    public final int l() {
        return this.f19823b.l();
    }

    @Override // e1.h0
    public final Range m() {
        return this.f19824c;
    }

    @Override // e1.h0
    public final boolean n(int i, int i10) {
        h0 h0Var = this.f19823b;
        if (h0Var.n(i, i10)) {
            return true;
        }
        for (Size size : this.f19826e) {
            if (size.getWidth() == i && size.getHeight() == i10) {
                return true;
            }
        }
        return this.f19824c.contains(Integer.valueOf(i)) && this.f19825d.contains(Integer.valueOf(i10)) && i % h0Var.c() == 0 && i10 % h0Var.l() == 0;
    }

    @Override // e1.h0
    public final Range p() {
        return this.f19825d;
    }
}
