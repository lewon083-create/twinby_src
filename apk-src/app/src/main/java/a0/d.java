package a0;

import android.content.Intent;
import android.graphics.Bitmap;
import android.media.MediaCodec;
import android.util.Log;
import com.google.android.gms.internal.ads.om1;
import com.google.android.gms.internal.measurement.i4;
import com.vk.api.sdk.VK;
import com.vk.api.sdk.VKApiCallback;
import com.vk.api.sdk.internal.ApiCommand;
import com.vk.api.sdk.ui.VKCaptchaActivity;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f59b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f60c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f61d;

    public /* synthetic */ d(int i, Object obj, Object obj2) {
        this.f59b = i;
        this.f60c = obj;
        this.f61d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        v7.f fVar;
        switch (this.f59b) {
            case 0:
                i4 i4Var = (i4) this.f60c;
                g0.j1 j1Var = (g0.j1) this.f61d;
                i4Var.getClass();
                j1Var.a(i4Var);
                return;
            case 1:
                b0 b0Var = (b0) this.f60c;
                j1.h hVar = (j1.h) this.f61d;
                t.p pVar = b0Var.f34g;
                y.a aVar = pVar.f33204b;
                synchronized (aVar.f36291a) {
                    aVar.f36293c.clear();
                    aVar.f36294d.clear();
                    aVar.f36296f.clear();
                    aVar.f36295e.clear();
                    aVar.f36297g = 0;
                    break;
                }
                pVar.f33211j.d();
                if (b0Var.f33f != null) {
                    Executor executor = b0Var.f31d;
                    if (executor instanceof s) {
                        s sVar = (s) executor;
                        synchronized (sVar.f220b) {
                            try {
                                if (!sVar.f221c.isShutdown()) {
                                    sVar.f221c.shutdown();
                                }
                            } finally {
                            }
                        }
                    }
                    b0Var.f33f.quit();
                    break;
                }
                hVar.b(null);
                return;
            case 2:
                e2 e2Var = (e2) this.f60c;
                e2 e2Var2 = (e2) this.f61d;
                e2Var.a();
                if (e2Var2 != null) {
                    e2Var2.a();
                    return;
                }
                return;
            case 3:
                w1 w1Var = (w1) this.f60c;
                g0.j1 j1Var2 = (g0.j1) this.f61d;
                w1Var.getClass();
                j1Var2.a(w1Var);
                return;
            case 4:
                ((z1) this.f60c).a((o2) this.f61d);
                return;
            case 5:
                x0.v vVar = (x0.v) this.f60c;
                Throwable th2 = (Throwable) this.f61d;
                vVar.getClass();
                com.google.android.gms.internal.auth.g.l("Recorder", "Error occurred after audio source started.", th2);
                if (th2 instanceof a1.h) {
                    ((i7.h) vVar.f35681c).accept(th2);
                    return;
                }
                return;
            case 6:
                a1.g gVar = (a1.g) this.f60c;
                e1.x xVar = (e1.x) this.f61d;
                int iM = t.z.m(gVar.f332g);
                if (iM != 0 && iM != 1) {
                    if (iM == 2) {
                        throw new AssertionError("AudioSource is released");
                    }
                    return;
                } else {
                    if (gVar.f336l != xVar) {
                        gVar.b(xVar);
                        return;
                    }
                    return;
                }
            case 7:
                a1.g gVar2 = (a1.g) this.f60c;
                j1.h hVar2 = (j1.h) this.f61d;
                gVar2.getClass();
                try {
                    int iM2 = t.z.m(gVar2.f332g);
                    if (iM2 == 0 || iM2 == 1) {
                        gVar2.b(null);
                        gVar2.f330e.f396b.getAndSet(true);
                        a1.s sVar2 = gVar2.f329d;
                        if (!sVar2.f385b.getAndSet(true)) {
                            sVar2.f387d.execute(new a1.p(sVar2, 3));
                        }
                        gVar2.e();
                        gVar2.d(3);
                    }
                    hVar2.b(null);
                    return;
                } catch (Throwable th3) {
                    hVar2.d(th3);
                    return;
                }
            case 8:
                ((x0.b0) ((x0.v) this.f61d).f35682d).f35536e0 = ((a1.g) this.f60c).f344t;
                return;
            case 9:
                String str = (String) this.f60c;
                a3.f violation = (a3.f) this.f61d;
                Intrinsics.checkNotNullParameter(violation, "$violation");
                Log.e("FragmentStrictMode", "Policy violation with PENALTY_DEATH in " + str, violation);
                throw violation;
            case 10:
                b4.d dVar = (b4.d) this.f60c;
                d dVar2 = (d) this.f61d;
                ((b4.n) dVar.f1869f).h();
                b4.h hVar3 = (b4.h) dVar.f1868e;
                synchronized (hVar3.f1886b) {
                    hVar3.b();
                    dVar2.run();
                    break;
                }
                return;
            case 11:
                b4.s sVar3 = (b4.s) this.f60c;
                sVar3.F.set(sVar3.w((r3.b) this.f61d, sVar3.f1957z, 0));
                return;
            case 12:
                bf.g gVar3 = (bf.g) this.f60c;
                bf.f fVar2 = (bf.f) this.f61d;
                gVar3.getClass();
                fVar2.f2109b.run();
                gVar3.f2115f = fVar2;
                gVar3.f2114e.run();
                return;
            case 13:
                bf.i iVar = (bf.i) this.f60c;
                bf.g gVar4 = (bf.g) this.f61d;
                synchronized (iVar) {
                    try {
                        HashSet hashSet = new HashSet((HashSet) iVar.f2120f);
                        ((HashSet) iVar.f2121g).remove(gVar4);
                        ((HashSet) iVar.f2120f).add(gVar4);
                        bf.f fVar3 = gVar4.f2115f;
                        if (fVar3 == null || (fVar = fVar3.f2108a) == null || !((bf.e) fVar.f34767c).k()) {
                            bf.f fVar4 = gVar4.f2115f;
                            if ((fVar4 != null ? fVar4.a() : null) != null) {
                                HashMap map = (HashMap) iVar.f2122h;
                                bf.f fVar5 = gVar4.f2115f;
                                map.remove(fVar5 != null ? fVar5.a() : null);
                            }
                        }
                        iVar.i(gVar4);
                        Iterator it = hashSet.iterator();
                        while (it.hasNext()) {
                            iVar.i((bf.g) it.next());
                        }
                    } finally {
                    }
                    break;
                }
                return;
            case 14:
                ((com.google.firebase.messaging.j) this.f60c).a((Intent) this.f61d);
                return;
            case 15:
                com.google.firebase.messaging.s sVar4 = (com.google.firebase.messaging.s) this.f60c;
                sb.g gVar5 = (sb.g) this.f61d;
                try {
                    gVar5.b(sVar4.a());
                    return;
                } catch (Exception e3) {
                    gVar5.a(e3);
                    return;
                }
            case 16:
                VK.m19execute$lambda3$lambda1((VKApiCallback) this.f60c, this.f61d);
                return;
            case 17:
                VK.m20execute$lambda3$lambda2((Exception) this.f60c, (VKApiCallback) this.f61d);
                return;
            case 18:
                VK.m18execute$lambda3((ApiCommand) this.f60c, (VKApiCallback) this.f61d);
                return;
            case 19:
                VKCaptchaActivity.m23displayImage$lambda5((VKCaptchaActivity) this.f60c, (Bitmap) this.f61d);
                return;
            case 20:
                VKCaptchaActivity.m24loadImage$lambda4((String) this.f60c, (VKCaptchaActivity) this.f61d);
                return;
            case 21:
                d.n nVar = (d.n) this.f60c;
                nVar.getLifecycle().a(new d.d((d.w) this.f61d, nVar));
                return;
            case 22:
                ((hi.g) this.f60c).success((String) this.f61d);
                return;
            case 23:
                ((e1.c0) this.f60c).f15929n.remove((e1.t) this.f61d);
                return;
            case 24:
                Executor executor2 = (Executor) this.f60c;
                e1.a0 a0Var = (e1.a0) this.f61d;
                Objects.requireNonNull(a0Var);
                executor2.execute(new d1(15, a0Var));
                return;
            case 25:
                ((e1.c0) this.f60c).f15928m.remove((j1.h) this.f61d);
                return;
            case 26:
                ((g0.s1) ((Map.Entry) this.f60c).getKey()).a((z0.b) this.f61d);
                return;
            case 27:
                e1.x xVar2 = (e1.x) this.f60c;
                g0.s1 s1Var = (g0.s1) this.f61d;
                LinkedHashMap linkedHashMap = xVar2.f16004b;
                s1Var.getClass();
                linkedHashMap.remove(s1Var);
                return;
            case 28:
                ((g0.s1) this.f60c).a((z0.b) this.f61d);
                return;
            default:
                e1.a0 a0Var2 = (e1.a0) this.f60c;
                MediaCodec.CodecException codecException = (MediaCodec.CodecException) this.f61d;
                e1.c0 c0Var = a0Var2.f15894l;
                switch (t.z.m(c0Var.G)) {
                    case 0:
                    case 7:
                    case 8:
                        return;
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        c0Var.b(codecException.getMessage(), codecException, 1);
                        return;
                    default:
                        throw new IllegalStateException("Unknown state: ".concat(om1.E(c0Var.G)));
                }
        }
    }
}
