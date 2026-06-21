package t;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Trace;
import androidx.camera.video.internal.compat.quirk.DeactivateEncoderSurfaceBeforeStopEncoderQuirk;
import com.google.android.gms.internal.ads.y50;
import com.google.android.gms.internal.ads.yf0;
import com.google.android.gms.internal.ads.zz;
import com.google.android.gms.internal.measurement.b4;
import com.google.android.gms.internal.measurement.d4;
import g0.s2;
import java.nio.MappedByteBuffer;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import yads.Cif;
import yads.bc2;
import yads.dd0;
import yads.e43;
import yads.ek0;
import yads.f43;
import yads.kb0;
import yads.oh3;
import yads.pk0;
import yads.rb3;
import yads.sp2;
import yads.t62;
import yads.v62;
import yads.zc0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f32941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f32942c;

    public /* synthetic */ a0(int i, Object obj) {
        this.f32941b = i;
        this.f32942c = obj;
    }

    private final void a() {
        u2.l lVar = (u2.l) this.f32942c;
        synchronized (lVar.f34047d) {
            try {
                if (lVar.f34051h == null) {
                    return;
                }
                try {
                    d2.i iVarC = lVar.c();
                    int i = iVarC.f15553f;
                    if (i == 2) {
                        synchronized (lVar.f34047d) {
                        }
                    }
                    if (i != 0) {
                        throw new RuntimeException("fetchFonts result is not OK. (" + i + ")");
                    }
                    try {
                        int i10 = c2.j.f2200a;
                        Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                        t0 t0Var = lVar.f34046c;
                        Context context = lVar.f34044a;
                        t0Var.getClass();
                        d2.i[] iVarArr = {iVarC};
                        b4 b4Var = x1.d.f35695a;
                        Trace.beginSection(com.google.android.gms.internal.auth.g.M("TypefaceCompat.createFromFontInfo"));
                        try {
                            Typeface typefaceI = x1.d.f35695a.i(context, iVarArr, 0);
                            Trace.endSection();
                            MappedByteBuffer mappedByteBufferQ = d4.q(lVar.f34044a, iVarC.f15548a);
                            if (mappedByteBufferQ == null || typefaceI == null) {
                                throw new RuntimeException("Unable to open file.");
                            }
                            try {
                                Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                com.google.firebase.messaging.y yVar = new com.google.firebase.messaging.y(typefaceI, a.a.m(mappedByteBufferQ));
                                Trace.endSection();
                                synchronized (lVar.f34047d) {
                                    try {
                                        ya.e eVar = lVar.f34051h;
                                        if (eVar != null) {
                                            eVar.w(yVar);
                                        }
                                    } finally {
                                    }
                                }
                                lVar.b();
                            } finally {
                                int i11 = c2.j.f2200a;
                            }
                        } finally {
                            Trace.endSection();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                } catch (Throwable th3) {
                    synchronized (lVar.f34047d) {
                        try {
                            ya.e eVar2 = lVar.f34051h;
                            if (eVar2 != null) {
                                eVar2.v(th3);
                            }
                            lVar.b();
                        } finally {
                        }
                    }
                }
            } finally {
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zIsEmpty;
        switch (this.f32941b) {
            case 0:
                androidx.lifecycle.v0 v0Var = (androidx.lifecycle.v0) this.f32942c;
                if (v0Var.f1601c) {
                    return;
                }
                f2.g.h(null, ((b0) v0Var.f1603e).f32954f.M == 8 || ((b0) v0Var.f1603e).f32954f.M == 7);
                if (((b0) v0Var.f1603e).c()) {
                    ((b0) v0Var.f1603e).f32954f.J(true);
                    return;
                } else {
                    ((b0) v0Var.f1603e).f32954f.K(true);
                    return;
                }
            case 1:
                ((m0) this.f32942c).i.c();
                return;
            case 2:
                ((l0.i) this.f32942c).b();
                return;
            case 3:
                h1 h1Var = (h1) this.f32942c;
                synchronized (h1Var.f33063a) {
                    if (h1Var.f33064b.isEmpty()) {
                        return;
                    }
                    try {
                        h1Var.j(h1Var.f33064b);
                        return;
                    } finally {
                        h1Var.f33064b.clear();
                    }
                }
            case 4:
                for (h2 h2Var : (LinkedHashSet) this.f32942c) {
                    h2Var.getClass();
                    h2Var.c(h2Var);
                }
                return;
            case 5:
                t3.d dVar = (t3.d) this.f32942c;
                dVar.z(dVar.u(), 1028, new t3.b(22));
                dVar.f33422f.d();
                return;
            case 6:
                ((u.o) this.f32942c).f33973b.onCameraAccessPrioritiesChanged();
                return;
            case 7:
                a();
                return;
            case 8:
                ((yf0) this.f32942c).e(-1, new tf.a(20));
                return;
            case 9:
                u3.y yVar = (u3.y) this.f32942c;
                if (yVar.f34216a0 >= 300000) {
                    ((u3.a0) yVar.f34229n.f27180c).U0 = true;
                    yVar.f34216a0 = 0L;
                    return;
                }
                return;
            case 10:
                zz zzVar = (zz) this.f32942c;
                zzVar.f();
                w0.e eVar = (w0.e) zzVar.f13155f;
                Set<w0.a> setKeySet = (HashSet) zzVar.i;
                synchronized (eVar.f34953a) {
                    if (setKeySet == null) {
                        try {
                            setKeySet = eVar.f34954b.keySet();
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    for (w0.a aVar : setKeySet) {
                        if (eVar.f34954b.containsKey(aVar)) {
                            eVar.l((w0.b) eVar.f34954b.get(aVar));
                        }
                    }
                    break;
                }
                return;
            case 11:
                e1.m mVar = (e1.m) this.f32942c;
                com.google.android.gms.internal.auth.g.e("Recorder", "The source didn't become non-streaming before timeout. Waited 1000ms");
                if (c1.a.f2187a.i(DeactivateEncoderSurfaceBeforeStopEncoderQuirk.class) != null) {
                    x0.b0.r(mVar);
                    return;
                }
                return;
            case 12:
                k6.o oVar = (k6.o) ((x0.v) this.f32942c).f35682d;
                if (oVar.f27141b) {
                    return;
                }
                com.google.android.gms.internal.auth.g.e("Recorder", "Retry setupVideo #" + oVar.f27142c);
                a0.o2 o2Var = (a0.o2) oVar.f27143d;
                s2 s2Var = (s2) oVar.f27144e;
                x0.b0 b0Var = (x0.b0) oVar.f27146g;
                b0Var.z().a(new q0.o(oVar, o2Var, s2Var, 13), b0Var.f35533d);
                return;
            case 13:
                ((x0.k0) this.f32942c).r();
                return;
            case 14:
                ((j1.h) ((y50) this.f32942c).f12510l).b(null);
                return;
            case 15:
                ((ni.i) this.f32942c).y();
                return;
            case 16:
                z.c cVar = (z.c) this.f32942c;
                j1.h hVar = cVar.f45773g;
                if (hVar != null) {
                    hVar.b(null);
                    cVar.f45773g = null;
                    return;
                }
                return;
            case 17:
                z2.t tVar = (z2.t) this.f32942c;
                tVar.P.f45923f.a(tVar.f45971e);
                tVar.f45971e = null;
                return;
            case 18:
                zh.g gVar = (zh.g) this.f32942c;
                ExecutorService executorService = gVar.f46288a;
                ConcurrentLinkedQueue concurrentLinkedQueue = gVar.f46289b;
                AtomicBoolean atomicBoolean = gVar.f46290c;
                if (atomicBoolean.compareAndSet(false, true)) {
                    try {
                        Runnable runnable = (Runnable) concurrentLinkedQueue.poll();
                        if (runnable != null) {
                            runnable.run();
                        }
                        if (zIsEmpty) {
                            return;
                        } else {
                            return;
                        }
                    } finally {
                        atomicBoolean.set(false);
                        if (!concurrentLinkedQueue.isEmpty()) {
                            executorService.execute(new a0(18, gVar));
                        }
                    }
                    break;
                }
                return;
            case 19:
                bc2.a((bc2) this.f32942c);
                return;
            case 20:
                ((dd0) this.f32942c).a();
                return;
            case 21:
                e43.a((f43) this.f32942c);
                return;
            case 22:
                ek0.a((ek0) this.f32942c);
                return;
            case 23:
                ((zc0) this.f32942c).a((pk0) null);
                return;
            case 24:
                Cif.a((hk.r) this.f32942c);
                return;
            case 25:
                ((kb0) this.f32942c).d();
                return;
            case 26:
                oh3.a((oh3) this.f32942c);
                return;
            case 27:
                rb3.a((rb3) this.f32942c);
                return;
            case 28:
                ((sp2) this.f32942c).b();
                return;
            default:
                t62.a((v62) this.f32942c);
                return;
        }
    }
}
