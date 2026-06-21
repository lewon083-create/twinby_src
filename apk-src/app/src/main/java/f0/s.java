package f0;

import a0.f0;
import a0.h1;
import a0.k1;
import a0.l1;
import a0.l2;
import a0.n0;
import a0.o0;
import android.util.Log;
import androidx.camera.core.internal.compat.quirk.ImageCaptureRotationOptionQuirk;
import com.google.android.gms.internal.measurement.b4;
import e1.y;
import g0.g1;
import g0.q1;
import g0.r0;
import g0.r1;
import g0.s0;
import g0.t0;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import t.x1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class s implements n0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a7.l f16553c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a1.m f16554d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public q f16555e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f16556f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayDeque f16552b = new ArrayDeque();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f16557g = false;

    public s(a7.l lVar) {
        b4.e();
        this.f16553c = lVar;
        this.f16556f = new ArrayList();
    }

    @Override // a0.n0
    public final void a(o0 o0Var) {
        hl.d.s().execute(new r(this, 1));
    }

    public final void b() {
        b4.e();
        l1 l1Var = new l1("Camera is closed.", null, 3);
        ArrayDeque<f> arrayDeque = this.f16552b;
        for (f fVar : arrayDeque) {
            fVar.f16497c.execute(new y(13, fVar, l1Var));
        }
        arrayDeque.clear();
        for (q qVar : new ArrayList(this.f16556f)) {
            qVar.getClass();
            b4.e();
            if (!qVar.f16545d.f26173c.isDone()) {
                b4.e();
                qVar.f16548g = true;
                k0.b bVar = qVar.i;
                Objects.requireNonNull(bVar);
                bVar.cancel(true);
                qVar.f16546e.d(l1Var);
                qVar.f16547f.b(null);
                b4.e();
                f fVar2 = qVar.f16542a;
                fVar2.f16497c.execute(new y(13, fVar2, l1Var));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c() {
        f0 f0Var;
        g0.p pVar;
        l2 l2Var;
        b4.e();
        Log.d("TakePictureManagerImpl", "Issue the next TakePictureRequest.");
        if (this.f16555e != null) {
            Log.d("TakePictureManagerImpl", "There is already a request in-flight.");
            return;
        }
        if (this.f16557g) {
            Log.d("TakePictureManagerImpl", "The class is paused.");
            return;
        }
        a1.m mVar = this.f16554d;
        mVar.getClass();
        b4.e();
        if (((x1) mVar.f364d).g() == 0) {
            Log.d("TakePictureManagerImpl", "Too many acquire images. Close image to be able to process next.");
            return;
        }
        f fVar = (f) this.f16552b.poll();
        if (fVar == null) {
            Log.d("TakePictureManagerImpl", "No new request.");
            return;
        }
        q qVar = new q(fVar, this);
        int i = 0;
        boolean z5 = true;
        f2.g.h(null, !(this.f16555e != null));
        this.f16555e = qVar;
        b4.e();
        qVar.f16544c.f26173c.a(new r(this, i), hl.d.j());
        this.f16556f.add(qVar);
        b4.e();
        qVar.f16545d.f26173c.a(new y(12, this, qVar), hl.d.j());
        a1.m mVar2 = this.f16554d;
        b4.e();
        j1.k kVar = qVar.f16544c;
        mVar2.getClass();
        b4.e();
        f0 f0Var2 = (f0) ((g1) mVar2.f362b).g(g1.O, new f0(Arrays.asList(new t0())));
        Objects.requireNonNull(f0Var2);
        int i10 = a1.m.f361g;
        a1.m.f361g = i10 + 1;
        a aVar = (a) mVar2.f366f;
        ArrayList arrayList = new ArrayList();
        String strValueOf = String.valueOf(f0Var2.hashCode());
        List<t0> list = f0Var2.f77a;
        Objects.requireNonNull(list);
        for (t0 t0Var : list) {
            r0 r0Var = new r0();
            s0 s0Var = (s0) mVar2.f363c;
            int i11 = i;
            r0Var.f19728c = s0Var.f19747c;
            r0Var.c(s0Var.f19746b);
            r0Var.a(fVar.f16505l);
            l2 l2Var2 = aVar.f16477c;
            int i12 = aVar.f16481g;
            ArrayList arrayList2 = aVar.f16482h;
            Objects.requireNonNull(l2Var2);
            r0Var.d(l2Var2);
            a1.m mVar3 = mVar2;
            if (arrayList2.size() > 1 && (l2Var = aVar.f16478d) != null) {
                r0Var.d(l2Var);
            }
            l2 l2Var3 = aVar.f16479e;
            boolean z10 = l2Var3 != null ? 1 : i11;
            if (z10 != 0) {
                Objects.requireNonNull(l2Var3);
                r0Var.d(l2Var3);
            }
            r0Var.f19726a = z10;
            if (com.google.android.gms.internal.auth.m.n(i12) || i12 == 32) {
                if (((ImageCaptureRotationOptionQuirk) n0.a.f28964a.i(ImageCaptureRotationOptionQuirk.class)) != null) {
                    g0.g gVar = s0.i;
                } else {
                    ((q1) r0Var.f19730e).y(s0.i, Integer.valueOf(fVar.f16502h));
                }
                f0Var = f0Var2;
                ((q1) r0Var.f19730e).y(s0.f19743j, Integer.valueOf(((fVar.f16498d != null ? 1 : i11) == 0 || !i0.q.c(fVar.f16500f, aVar.f16480f)) ? fVar.i : fVar.f16503j == 0 ? 100 : 95));
            } else {
                f0Var = f0Var2;
            }
            r0Var.c(t0Var.f19763a.f19746b);
            ((r1) r0Var.f19732g).f19735a.put(strValueOf, Integer.valueOf(i11));
            ((r1) r0Var.f19732g).f19735a.put("CAPTURE_CONFIG_ID_KEY", Integer.valueOf(i10));
            r0Var.b(aVar.f16475a);
            if (arrayList2.size() > 1 && (pVar = aVar.f16476b) != null) {
                r0Var.b(pVar);
            }
            arrayList.add(r0Var.e());
            z5 = true;
            i = i11;
            mVar2 = mVar3;
            f0Var2 = f0Var;
        }
        boolean z11 = i;
        boolean z12 = z5;
        a1.e eVar = new a1.e(21, arrayList, qVar, z11);
        o oVar = new o(f0Var2, fVar, qVar, kVar, i10);
        a1.m mVar4 = this.f16554d;
        mVar4.getClass();
        b4.e();
        ((a) mVar4.f366f).f16483j.accept(oVar);
        b4.e();
        k1 k1Var = (k1) this.f16553c.f491c;
        synchronized (k1Var.f141r) {
            try {
                if (k1Var.f141r.get() == null) {
                    k1Var.f141r.set(Integer.valueOf(k1Var.I()));
                }
            } finally {
            }
        }
        k1 k1Var2 = (k1) this.f16553c.f491c;
        b4.e();
        k0.b bVarJ = k0.j.j(k1Var2.f().j(arrayList, k1Var2.f140q, k1Var2.f142s), new v7.f(25, new h1(0)), hl.d.j());
        k0.j.a(bVarJ, new a1.e(24, this, eVar), hl.d.s());
        b4.e();
        if (qVar.i != null) {
            z12 = false;
        }
        f2.g.h("CaptureRequestFuture can only be set once.", z12);
        qVar.i = bVarJ;
    }

    public final void d(f fVar) {
        b4.e();
        com.google.android.gms.internal.auth.g.e("TakePictureManagerImpl", "Add a new request for retrying.");
        this.f16552b.addFirst(fVar);
        c();
    }
}
