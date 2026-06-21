package e1;

import android.content.Context;
import android.media.MediaCodecInfo;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.ads.hx;
import com.google.android.gms.internal.ads.om1;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import j3.n0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import ob.h4;
import ob.i1;
import ob.l1;
import ob.s0;
import ob.t1;
import q9.e2;
import z2.q0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d0 implements j3.j0, t1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f15951b;

    public d0(l1 l1Var) {
        pa.c0.i(l1Var);
        this.f15951b = l1Var;
    }

    public abstract void A();

    public ed.d B() {
        return hx.f6279a.a((h4) this.f15951b);
    }

    public void C() {
        i1 i1Var = ((l1) this.f15951b).f30266h;
        l1.k(i1Var);
        i1Var.C();
    }

    @Override // ob.t1
    public s0 b() {
        throw null;
    }

    @Override // ob.t1
    public i1 e() {
        throw null;
    }

    @Override // ob.t1
    public l7.b g() {
        throw null;
    }

    @Override // ob.t1
    public Context j() {
        throw null;
    }

    @Override // ob.t1
    public ua.a o() {
        throw null;
    }

    public void q(String str, String str2) {
        if (!TextUtils.isEmpty(str2) && str2.contains(StringUtils.COMMA)) {
            StringBuilder sb2 = new StringBuilder(str2.length() + 108);
            sb2.append("Value ");
            sb2.append(str2);
            sb2.append(" contains invalid character ',' (comma). The server will parse it as a list of comma-separated values.");
            u9.i.h(sb2.toString());
        }
        ((e2) this.f15951b).f31831e.putString(str, str2);
    }

    public d0 r(Bundle bundle, Class cls) {
        e2 e2Var = (e2) this.f15951b;
        e2Var.f31828b.putBundle(cls.getName(), bundle);
        if (cls.equals(AdMobAdapter.class) && bundle.getBoolean("_emulatorLiveAds")) {
            e2Var.f31830d.remove("B3EEABB8EE11C2BE770B684D95219ECB");
        }
        return x();
    }

    public abstract void s(com.google.firebase.messaging.y yVar);

    public abstract String t();

    public boolean u() {
        s3.y yVar = (s3.y) this;
        if (yVar.Q() != 3 || !yVar.P()) {
            return false;
        }
        yVar.n0();
        return yVar.f32702j0.f32669n == 0;
    }

    public boolean v() {
        z2.s0 s0Var;
        q0 q0Var = (q0) this.f15951b;
        View view = q0Var.f45939c.G;
        z2.s0 s0Var2 = z2.s0.f45964c;
        if (view != null) {
            Intrinsics.checkNotNullParameter(view, "<this>");
            float alpha = view.getAlpha();
            s0Var = z2.s0.f45966e;
            if (alpha != 0.0f || view.getVisibility() != 0) {
                int visibility = view.getVisibility();
                if (visibility == 0) {
                    s0Var = s0Var2;
                } else if (visibility != 4) {
                    if (visibility != 8) {
                        throw new IllegalArgumentException(l7.o.i(visibility, "Unknown visibility "));
                    }
                    s0Var = z2.s0.f45965d;
                }
            }
        } else {
            s0Var = null;
        }
        z2.s0 s0Var3 = q0Var.f45937a;
        if (s0Var != s0Var3) {
            return (s0Var == s0Var2 || s0Var3 == s0Var2) ? false : true;
        }
        return true;
    }

    public abstract void w(int i, long j10);

    public abstract d0 x();

    public void y(String str) {
        pa.c0.j(str, "Content URL must be non-null.");
        pa.c0.g(str, "Content URL must be non-empty.");
        int length = str.length();
        pa.c0.c(length <= 512, "Content URL must not exceed %d in length.  Provided length was %d.", 512, Integer.valueOf(str.length()));
        ((e2) this.f15951b).f31833g = str;
    }

    public void z(List list) {
        if (list == null) {
            u9.i.h("neighboring content URLs list should not be null");
            return;
        }
        ArrayList arrayList = ((e2) this.f15951b).f31834h;
        arrayList.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (TextUtils.isEmpty(str)) {
                u9.i.h("neighboring content URL should not be null or empty");
            } else {
                arrayList.add(str);
            }
        }
    }

    public d0(int i) {
        switch (i) {
            case 2:
                e2 e2Var = new e2();
                this.f15951b = e2Var;
                e2Var.f31830d.add("B3EEABB8EE11C2BE770B684D95219ECB");
                break;
            case 5:
                this.f15951b = new h4(12, this);
                break;
            default:
                this.f15951b = new n0();
                break;
        }
    }

    public d0(MediaCodecInfo mediaCodecInfo, String str) throws e0 {
        try {
            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
            Objects.requireNonNull(capabilitiesForType);
            this.f15951b = capabilitiesForType;
        } catch (RuntimeException e3) {
            throw new e0(om1.k("Unable to get CodecCapabilities for mime: ", str), e3);
        }
    }

    public d0(q4.a0 a0Var) {
        this.f15951b = a0Var;
    }

    public d0(q0 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        this.f15951b = operation;
    }
}
