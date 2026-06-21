package p1;

import android.view.ViewGroup;
import com.vk.api.sdk.exceptions.VKApiCodes;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f30839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f30840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f30841c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i f30842d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l f30843e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public HashMap f30844f;

    public h() {
        k kVar = new k();
        kVar.f30893a = 0;
        kVar.f30894b = 0;
        kVar.f30895c = 1.0f;
        kVar.f30896d = Float.NaN;
        this.f30840b = kVar;
        j jVar = new j();
        jVar.f30885a = -1;
        jVar.f30886b = 0;
        jVar.f30887c = -1;
        jVar.f30888d = Float.NaN;
        jVar.f30889e = Float.NaN;
        jVar.f30890f = Float.NaN;
        jVar.f30891g = -1;
        jVar.f30892h = null;
        jVar.i = -1;
        this.f30841c = jVar;
        i iVar = new i();
        iVar.f30846a = false;
        iVar.f30852d = -1;
        iVar.f30854e = -1;
        iVar.f30856f = -1.0f;
        iVar.f30858g = true;
        iVar.f30860h = -1;
        iVar.i = -1;
        iVar.f30862j = -1;
        iVar.f30864k = -1;
        iVar.f30866l = -1;
        iVar.f30868m = -1;
        iVar.f30870n = -1;
        iVar.f30872o = -1;
        iVar.f30873p = -1;
        iVar.f30874q = -1;
        iVar.f30875r = -1;
        iVar.f30876s = -1;
        iVar.f30877t = -1;
        iVar.f30878u = -1;
        iVar.f30879v = -1;
        iVar.f30880w = 0.5f;
        iVar.f30881x = 0.5f;
        iVar.f30882y = null;
        iVar.f30883z = -1;
        iVar.A = 0;
        iVar.B = 0.0f;
        iVar.C = -1;
        iVar.D = -1;
        iVar.E = -1;
        iVar.F = 0;
        iVar.G = 0;
        iVar.H = 0;
        iVar.I = 0;
        iVar.J = 0;
        iVar.K = 0;
        iVar.L = 0;
        iVar.M = VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
        iVar.N = VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
        iVar.O = VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
        iVar.P = VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
        iVar.Q = VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
        iVar.R = VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
        iVar.S = VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
        iVar.T = -1.0f;
        iVar.U = -1.0f;
        iVar.V = 0;
        iVar.W = 0;
        iVar.X = 0;
        iVar.Y = 0;
        iVar.Z = 0;
        iVar.f30847a0 = 0;
        iVar.f30849b0 = 0;
        iVar.f30851c0 = 0;
        iVar.f30853d0 = 1.0f;
        iVar.f30855e0 = 1.0f;
        iVar.f30857f0 = -1;
        iVar.f30859g0 = 0;
        iVar.h0 = -1;
        iVar.f30867l0 = false;
        iVar.f30869m0 = false;
        iVar.f30871n0 = true;
        iVar.o0 = 0;
        this.f30842d = iVar;
        l lVar = new l();
        lVar.f30898a = 0.0f;
        lVar.f30899b = 0.0f;
        lVar.f30900c = 0.0f;
        lVar.f30901d = 1.0f;
        lVar.f30902e = 1.0f;
        lVar.f30903f = Float.NaN;
        lVar.f30904g = Float.NaN;
        lVar.f30905h = -1;
        lVar.i = 0.0f;
        lVar.f30906j = 0.0f;
        lVar.f30907k = 0.0f;
        lVar.f30908l = false;
        lVar.f30909m = 0.0f;
        this.f30843e = lVar;
        this.f30844f = new HashMap();
    }

    public final void a(d dVar) {
        i iVar = this.f30842d;
        dVar.f30784e = iVar.f30860h;
        dVar.f30786f = iVar.i;
        dVar.f30788g = iVar.f30862j;
        dVar.f30790h = iVar.f30864k;
        dVar.i = iVar.f30866l;
        dVar.f30792j = iVar.f30868m;
        dVar.f30794k = iVar.f30870n;
        dVar.f30796l = iVar.f30872o;
        dVar.f30798m = iVar.f30873p;
        dVar.f30800n = iVar.f30874q;
        dVar.f30802o = iVar.f30875r;
        dVar.f30807s = iVar.f30876s;
        dVar.f30808t = iVar.f30877t;
        dVar.f30809u = iVar.f30878u;
        dVar.f30810v = iVar.f30879v;
        ((ViewGroup.MarginLayoutParams) dVar).leftMargin = iVar.F;
        ((ViewGroup.MarginLayoutParams) dVar).rightMargin = iVar.G;
        ((ViewGroup.MarginLayoutParams) dVar).topMargin = iVar.H;
        ((ViewGroup.MarginLayoutParams) dVar).bottomMargin = iVar.I;
        dVar.A = iVar.R;
        dVar.B = iVar.Q;
        dVar.f30812x = iVar.N;
        dVar.f30814z = iVar.P;
        dVar.E = iVar.f30880w;
        dVar.F = iVar.f30881x;
        dVar.f30803p = iVar.f30883z;
        dVar.f30805q = iVar.A;
        dVar.f30806r = iVar.B;
        dVar.G = iVar.f30882y;
        dVar.T = iVar.C;
        dVar.U = iVar.D;
        dVar.I = iVar.T;
        dVar.H = iVar.U;
        dVar.K = iVar.W;
        dVar.J = iVar.V;
        dVar.W = iVar.f30867l0;
        dVar.X = iVar.f30869m0;
        dVar.L = iVar.X;
        dVar.M = iVar.Y;
        dVar.P = iVar.Z;
        dVar.Q = iVar.f30847a0;
        dVar.N = iVar.f30849b0;
        dVar.O = iVar.f30851c0;
        dVar.R = iVar.f30853d0;
        dVar.S = iVar.f30855e0;
        dVar.V = iVar.E;
        dVar.f30780c = iVar.f30856f;
        dVar.f30776a = iVar.f30852d;
        dVar.f30778b = iVar.f30854e;
        ((ViewGroup.MarginLayoutParams) dVar).width = iVar.f30848b;
        ((ViewGroup.MarginLayoutParams) dVar).height = iVar.f30850c;
        String str = iVar.f30865k0;
        if (str != null) {
            dVar.Y = str;
        }
        dVar.Z = iVar.o0;
        dVar.setMarginStart(iVar.K);
        dVar.setMarginEnd(iVar.J);
        dVar.a();
    }

    public final Object clone() {
        h hVar = new h();
        i iVar = hVar.f30842d;
        iVar.getClass();
        i iVar2 = this.f30842d;
        iVar.f30846a = iVar2.f30846a;
        iVar.f30848b = iVar2.f30848b;
        iVar.f30850c = iVar2.f30850c;
        iVar.f30852d = iVar2.f30852d;
        iVar.f30854e = iVar2.f30854e;
        iVar.f30856f = iVar2.f30856f;
        iVar.f30858g = iVar2.f30858g;
        iVar.f30860h = iVar2.f30860h;
        iVar.i = iVar2.i;
        iVar.f30862j = iVar2.f30862j;
        iVar.f30864k = iVar2.f30864k;
        iVar.f30866l = iVar2.f30866l;
        iVar.f30868m = iVar2.f30868m;
        iVar.f30870n = iVar2.f30870n;
        iVar.f30872o = iVar2.f30872o;
        iVar.f30873p = iVar2.f30873p;
        iVar.f30874q = iVar2.f30874q;
        iVar.f30875r = iVar2.f30875r;
        iVar.f30876s = iVar2.f30876s;
        iVar.f30877t = iVar2.f30877t;
        iVar.f30878u = iVar2.f30878u;
        iVar.f30879v = iVar2.f30879v;
        iVar.f30880w = iVar2.f30880w;
        iVar.f30881x = iVar2.f30881x;
        iVar.f30882y = iVar2.f30882y;
        iVar.f30883z = iVar2.f30883z;
        iVar.A = iVar2.A;
        iVar.B = iVar2.B;
        iVar.C = iVar2.C;
        iVar.D = iVar2.D;
        iVar.E = iVar2.E;
        iVar.F = iVar2.F;
        iVar.G = iVar2.G;
        iVar.H = iVar2.H;
        iVar.I = iVar2.I;
        iVar.J = iVar2.J;
        iVar.K = iVar2.K;
        iVar.L = iVar2.L;
        iVar.M = iVar2.M;
        iVar.N = iVar2.N;
        iVar.O = iVar2.O;
        iVar.P = iVar2.P;
        iVar.Q = iVar2.Q;
        iVar.R = iVar2.R;
        iVar.S = iVar2.S;
        iVar.T = iVar2.T;
        iVar.U = iVar2.U;
        iVar.V = iVar2.V;
        iVar.W = iVar2.W;
        iVar.X = iVar2.X;
        iVar.Y = iVar2.Y;
        iVar.Z = iVar2.Z;
        iVar.f30847a0 = iVar2.f30847a0;
        iVar.f30849b0 = iVar2.f30849b0;
        iVar.f30851c0 = iVar2.f30851c0;
        iVar.f30853d0 = iVar2.f30853d0;
        iVar.f30855e0 = iVar2.f30855e0;
        iVar.f30857f0 = iVar2.f30857f0;
        iVar.f30859g0 = iVar2.f30859g0;
        iVar.h0 = iVar2.h0;
        iVar.f30865k0 = iVar2.f30865k0;
        int[] iArr = iVar2.f30861i0;
        if (iArr == null || iVar2.f30863j0 != null) {
            iVar.f30861i0 = null;
        } else {
            iVar.f30861i0 = Arrays.copyOf(iArr, iArr.length);
        }
        iVar.f30863j0 = iVar2.f30863j0;
        iVar.f30867l0 = iVar2.f30867l0;
        iVar.f30869m0 = iVar2.f30869m0;
        iVar.f30871n0 = iVar2.f30871n0;
        iVar.o0 = iVar2.o0;
        j jVar = hVar.f30841c;
        jVar.getClass();
        j jVar2 = this.f30841c;
        jVar2.getClass();
        jVar.f30885a = jVar2.f30885a;
        jVar.f30887c = jVar2.f30887c;
        jVar.f30889e = jVar2.f30889e;
        jVar.f30888d = jVar2.f30888d;
        k kVar = this.f30840b;
        int i = kVar.f30893a;
        k kVar2 = hVar.f30840b;
        kVar2.f30893a = i;
        kVar2.f30895c = kVar.f30895c;
        kVar2.f30896d = kVar.f30896d;
        kVar2.f30894b = kVar.f30894b;
        l lVar = hVar.f30843e;
        lVar.getClass();
        l lVar2 = this.f30843e;
        lVar2.getClass();
        lVar.f30898a = lVar2.f30898a;
        lVar.f30899b = lVar2.f30899b;
        lVar.f30900c = lVar2.f30900c;
        lVar.f30901d = lVar2.f30901d;
        lVar.f30902e = lVar2.f30902e;
        lVar.f30903f = lVar2.f30903f;
        lVar.f30904g = lVar2.f30904g;
        lVar.f30905h = lVar2.f30905h;
        lVar.i = lVar2.i;
        lVar.f30906j = lVar2.f30906j;
        lVar.f30907k = lVar2.f30907k;
        lVar.f30908l = lVar2.f30908l;
        lVar.f30909m = lVar2.f30909m;
        hVar.f30839a = this.f30839a;
        return hVar;
    }
}
