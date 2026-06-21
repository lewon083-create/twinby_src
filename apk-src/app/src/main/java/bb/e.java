package bb;

import a0.a0;
import a0.j2;
import a0.m2;
import a0.o2;
import a0.u;
import aj.e0;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.SystemClock;
import android.util.Log;
import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.ExcludedSupportedSizesQuirk;
import androidx.camera.camera2.internal.compat.quirk.ExtraSupportedOutputSizeQuirk;
import androidx.lifecycle.d0;
import com.google.android.gms.internal.ads.b7;
import com.google.android.gms.internal.ads.r9;
import com.google.android.gms.internal.ads.tw;
import com.google.android.gms.internal.ads.yd1;
import com.google.android.gms.internal.measurement.b4;
import com.google.android.gms.internal.measurement.h5;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.x;
import com.vk.api.sdk.exceptions.VKApiCodes;
import e1.n;
import e1.p;
import e1.y;
import f7.i;
import fj.b0;
import g0.f0;
import g0.n1;
import g0.s1;
import g0.t1;
import g8.l;
import i0.q;
import ii.o;
import io.appmetrica.analytics.impl.lp;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingBackgroundService;
import io.flutter.plugins.urllauncher.WebViewActivity;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Unit;
import m.h3;
import m3.c0;
import ob.l1;
import ob.t0;
import ob.z3;
import oe.k;
import q0.m;
import t3.j;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements ga.a, k0.c, kk.e, ii.h, t1, t0, k, o, n {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static e f2016f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static e f2017g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2018b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f2019c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f2020d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f2021e;

    public /* synthetic */ e(int i, Object obj, Object obj2, Object obj3, boolean z5) {
        this.f2018b = i;
        this.f2019c = obj2;
        this.f2020d = obj3;
        this.f2021e = obj;
    }

    public static void F(ii.f fVar, final e eVar) {
        bj.c cVar = bj.c.f2163a;
        Object obj = null;
        s7.g gVar = new s7.g(fVar, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.canLaunchUrl", cVar, obj);
        if (eVar != null) {
            final int i = 0;
            gVar.L(new ii.b(eVar) { // from class: bj.d

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ bb.e f2165c;

                {
                    this.f2165c = eVar;
                }

                @Override // ii.b
                public final void q(Object obj2, h3.e eVar2) {
                    switch (i) {
                        case 0:
                            bb.e eVar3 = this.f2165c;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, eVar3.h((String) ((ArrayList) obj2).get(0)));
                            } catch (Throwable th2) {
                                arrayList = hl.d.H(th2);
                            }
                            eVar2.i(arrayList);
                            break;
                        case 1:
                            bb.e eVar4 = this.f2165c;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj2;
                            try {
                                arrayList2.add(0, eVar4.x((Map) arrayList3.get(1), (String) arrayList3.get(0), (Boolean) arrayList3.get(2)));
                            } catch (Throwable th3) {
                                arrayList2 = hl.d.H(th3);
                            }
                            eVar2.i(arrayList2);
                            break;
                        case 2:
                            bb.e eVar5 = this.f2165c;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj2;
                            try {
                                arrayList4.add(0, eVar5.z((String) arrayList5.get(0), (Boolean) arrayList5.get(1), (e) arrayList5.get(2), (a) arrayList5.get(3)));
                            } catch (Throwable th4) {
                                arrayList4 = hl.d.H(th4);
                            }
                            eVar2.i(arrayList4);
                            break;
                        case 3:
                            bb.e eVar6 = this.f2165c;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                arrayList6.add(0, Boolean.valueOf(q.g.b((Context) eVar6.f2019c, Collections.EMPTY_LIST) != null));
                            } catch (Throwable th5) {
                                arrayList6 = hl.d.H(th5);
                            }
                            eVar2.i(arrayList6);
                            break;
                        default:
                            bb.e eVar7 = this.f2165c;
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                ((Context) eVar7.f2019c).sendBroadcast(new Intent("close action"));
                                arrayList7.add(0, null);
                            } catch (Throwable th6) {
                                arrayList7 = hl.d.H(th6);
                            }
                            eVar2.i(arrayList7);
                            break;
                    }
                }
            });
        } else {
            gVar.L(null);
        }
        s7.g gVar2 = new s7.g(fVar, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.launchUrl", cVar, obj);
        if (eVar != null) {
            final int i10 = 1;
            gVar2.L(new ii.b(eVar) { // from class: bj.d

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ bb.e f2165c;

                {
                    this.f2165c = eVar;
                }

                @Override // ii.b
                public final void q(Object obj2, h3.e eVar2) {
                    switch (i10) {
                        case 0:
                            bb.e eVar3 = this.f2165c;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, eVar3.h((String) ((ArrayList) obj2).get(0)));
                            } catch (Throwable th2) {
                                arrayList = hl.d.H(th2);
                            }
                            eVar2.i(arrayList);
                            break;
                        case 1:
                            bb.e eVar4 = this.f2165c;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj2;
                            try {
                                arrayList2.add(0, eVar4.x((Map) arrayList3.get(1), (String) arrayList3.get(0), (Boolean) arrayList3.get(2)));
                            } catch (Throwable th3) {
                                arrayList2 = hl.d.H(th3);
                            }
                            eVar2.i(arrayList2);
                            break;
                        case 2:
                            bb.e eVar5 = this.f2165c;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj2;
                            try {
                                arrayList4.add(0, eVar5.z((String) arrayList5.get(0), (Boolean) arrayList5.get(1), (e) arrayList5.get(2), (a) arrayList5.get(3)));
                            } catch (Throwable th4) {
                                arrayList4 = hl.d.H(th4);
                            }
                            eVar2.i(arrayList4);
                            break;
                        case 3:
                            bb.e eVar6 = this.f2165c;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                arrayList6.add(0, Boolean.valueOf(q.g.b((Context) eVar6.f2019c, Collections.EMPTY_LIST) != null));
                            } catch (Throwable th5) {
                                arrayList6 = hl.d.H(th5);
                            }
                            eVar2.i(arrayList6);
                            break;
                        default:
                            bb.e eVar7 = this.f2165c;
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                ((Context) eVar7.f2019c).sendBroadcast(new Intent("close action"));
                                arrayList7.add(0, null);
                            } catch (Throwable th6) {
                                arrayList7 = hl.d.H(th6);
                            }
                            eVar2.i(arrayList7);
                            break;
                    }
                }
            });
        } else {
            gVar2.L(null);
        }
        s7.g gVar3 = new s7.g(fVar, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.openUrlInApp", cVar, obj);
        if (eVar != null) {
            final int i11 = 2;
            gVar3.L(new ii.b(eVar) { // from class: bj.d

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ bb.e f2165c;

                {
                    this.f2165c = eVar;
                }

                @Override // ii.b
                public final void q(Object obj2, h3.e eVar2) {
                    switch (i11) {
                        case 0:
                            bb.e eVar3 = this.f2165c;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, eVar3.h((String) ((ArrayList) obj2).get(0)));
                            } catch (Throwable th2) {
                                arrayList = hl.d.H(th2);
                            }
                            eVar2.i(arrayList);
                            break;
                        case 1:
                            bb.e eVar4 = this.f2165c;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj2;
                            try {
                                arrayList2.add(0, eVar4.x((Map) arrayList3.get(1), (String) arrayList3.get(0), (Boolean) arrayList3.get(2)));
                            } catch (Throwable th3) {
                                arrayList2 = hl.d.H(th3);
                            }
                            eVar2.i(arrayList2);
                            break;
                        case 2:
                            bb.e eVar5 = this.f2165c;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj2;
                            try {
                                arrayList4.add(0, eVar5.z((String) arrayList5.get(0), (Boolean) arrayList5.get(1), (e) arrayList5.get(2), (a) arrayList5.get(3)));
                            } catch (Throwable th4) {
                                arrayList4 = hl.d.H(th4);
                            }
                            eVar2.i(arrayList4);
                            break;
                        case 3:
                            bb.e eVar6 = this.f2165c;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                arrayList6.add(0, Boolean.valueOf(q.g.b((Context) eVar6.f2019c, Collections.EMPTY_LIST) != null));
                            } catch (Throwable th5) {
                                arrayList6 = hl.d.H(th5);
                            }
                            eVar2.i(arrayList6);
                            break;
                        default:
                            bb.e eVar7 = this.f2165c;
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                ((Context) eVar7.f2019c).sendBroadcast(new Intent("close action"));
                                arrayList7.add(0, null);
                            } catch (Throwable th6) {
                                arrayList7 = hl.d.H(th6);
                            }
                            eVar2.i(arrayList7);
                            break;
                    }
                }
            });
        } else {
            gVar3.L(null);
        }
        s7.g gVar4 = new s7.g(fVar, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.supportsCustomTabs", cVar, obj);
        if (eVar != null) {
            final int i12 = 3;
            gVar4.L(new ii.b(eVar) { // from class: bj.d

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ bb.e f2165c;

                {
                    this.f2165c = eVar;
                }

                @Override // ii.b
                public final void q(Object obj2, h3.e eVar2) {
                    switch (i12) {
                        case 0:
                            bb.e eVar3 = this.f2165c;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, eVar3.h((String) ((ArrayList) obj2).get(0)));
                            } catch (Throwable th2) {
                                arrayList = hl.d.H(th2);
                            }
                            eVar2.i(arrayList);
                            break;
                        case 1:
                            bb.e eVar4 = this.f2165c;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj2;
                            try {
                                arrayList2.add(0, eVar4.x((Map) arrayList3.get(1), (String) arrayList3.get(0), (Boolean) arrayList3.get(2)));
                            } catch (Throwable th3) {
                                arrayList2 = hl.d.H(th3);
                            }
                            eVar2.i(arrayList2);
                            break;
                        case 2:
                            bb.e eVar5 = this.f2165c;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj2;
                            try {
                                arrayList4.add(0, eVar5.z((String) arrayList5.get(0), (Boolean) arrayList5.get(1), (e) arrayList5.get(2), (a) arrayList5.get(3)));
                            } catch (Throwable th4) {
                                arrayList4 = hl.d.H(th4);
                            }
                            eVar2.i(arrayList4);
                            break;
                        case 3:
                            bb.e eVar6 = this.f2165c;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                arrayList6.add(0, Boolean.valueOf(q.g.b((Context) eVar6.f2019c, Collections.EMPTY_LIST) != null));
                            } catch (Throwable th5) {
                                arrayList6 = hl.d.H(th5);
                            }
                            eVar2.i(arrayList6);
                            break;
                        default:
                            bb.e eVar7 = this.f2165c;
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                ((Context) eVar7.f2019c).sendBroadcast(new Intent("close action"));
                                arrayList7.add(0, null);
                            } catch (Throwable th6) {
                                arrayList7 = hl.d.H(th6);
                            }
                            eVar2.i(arrayList7);
                            break;
                    }
                }
            });
        } else {
            gVar4.L(null);
        }
        s7.g gVar5 = new s7.g(fVar, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.closeWebView", cVar, obj);
        if (eVar == null) {
            gVar5.L(null);
        } else {
            final int i13 = 4;
            gVar5.L(new ii.b(eVar) { // from class: bj.d

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ bb.e f2165c;

                {
                    this.f2165c = eVar;
                }

                @Override // ii.b
                public final void q(Object obj2, h3.e eVar2) {
                    switch (i13) {
                        case 0:
                            bb.e eVar3 = this.f2165c;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, eVar3.h((String) ((ArrayList) obj2).get(0)));
                            } catch (Throwable th2) {
                                arrayList = hl.d.H(th2);
                            }
                            eVar2.i(arrayList);
                            break;
                        case 1:
                            bb.e eVar4 = this.f2165c;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj2;
                            try {
                                arrayList2.add(0, eVar4.x((Map) arrayList3.get(1), (String) arrayList3.get(0), (Boolean) arrayList3.get(2)));
                            } catch (Throwable th3) {
                                arrayList2 = hl.d.H(th3);
                            }
                            eVar2.i(arrayList2);
                            break;
                        case 2:
                            bb.e eVar5 = this.f2165c;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj2;
                            try {
                                arrayList4.add(0, eVar5.z((String) arrayList5.get(0), (Boolean) arrayList5.get(1), (e) arrayList5.get(2), (a) arrayList5.get(3)));
                            } catch (Throwable th4) {
                                arrayList4 = hl.d.H(th4);
                            }
                            eVar2.i(arrayList4);
                            break;
                        case 3:
                            bb.e eVar6 = this.f2165c;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                arrayList6.add(0, Boolean.valueOf(q.g.b((Context) eVar6.f2019c, Collections.EMPTY_LIST) != null));
                            } catch (Throwable th5) {
                                arrayList6 = hl.d.H(th5);
                            }
                            eVar2.i(arrayList6);
                            break;
                        default:
                            bb.e eVar7 = this.f2165c;
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                ((Context) eVar7.f2019c).sendBroadcast(new Intent("close action"));
                                arrayList7.add(0, null);
                            } catch (Throwable th6) {
                                arrayList7 = hl.d.H(th6);
                            }
                            eVar2.i(arrayList7);
                            break;
                    }
                }
            });
        }
    }

    public static final SharedPreferences M(Context context) {
        return context.getSharedPreferences("app_set_id_storage", 0);
    }

    public static final void N(Context context) throws d {
        if (M(context).edit().putLong("app_set_id_last_used_time", System.currentTimeMillis()).commit()) {
            return;
        }
        String strValueOf = String.valueOf(context.getPackageName());
        Log.e("AppSet", strValueOf.length() != 0 ? "Failed to store app set ID last used time for App ".concat(strValueOf) : new String("Failed to store app set ID last used time for App "));
        throw new d("Failed to store the app set ID last used time.");
    }

    public static Bundle q(Map map) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            bundle.putString(str, (String) map.get(str));
        }
        return bundle;
    }

    @Override // g0.t1
    public ed.d A() {
        return i0.o.w(new b0(23, this));
    }

    public void B() {
        ((q0.f) this.f2019c).e();
        b4.G(new lp(21, this));
    }

    public void C(m4.a aVar) {
        j jVar = (j) ((HashMap) this.f2019c).remove(aVar);
        jVar.getClass();
        s3.e eVar = (s3.e) ((s3.f) this.f2021e).f32540p.get(jVar);
        if (eVar != null) {
            synchronized (eVar) {
                eVar.f32493d--;
            }
        }
    }

    public void D(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (!((HashSet) this.f2019c).remove(mediaCodec) || (loudnessCodecController = (LoudnessCodecController) this.f2021e) == null) {
            return;
        }
        loudnessCodecController.removeMediaCodec(mediaCodec);
    }

    public void E(int i) {
        LoudnessCodecController loudnessCodecController = (LoudnessCodecController) this.f2021e;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.f2021e = null;
        }
        LoudnessCodecController loudnessCodecControllerCreate = LoudnessCodecController.create(i, ed.a.f16332b, new b4.j(this));
        this.f2021e = loudnessCodecControllerCreate;
        Iterator it = ((HashSet) this.f2019c).iterator();
        while (it.hasNext()) {
            if (!loudnessCodecControllerCreate.addMediaCodec((MediaCodec) it.next())) {
                it.remove();
            }
        }
    }

    public void G(m1.e eVar, int i, int i10, int i11) {
        eVar.getClass();
        int i12 = eVar.f28453b0;
        int i13 = eVar.f28455c0;
        eVar.f28453b0 = 0;
        eVar.f28455c0 = 0;
        eVar.O(i10);
        eVar.L(i11);
        if (i12 < 0) {
            eVar.f28453b0 = 0;
        } else {
            eVar.f28453b0 = i12;
        }
        if (i13 < 0) {
            eVar.f28455c0 = 0;
        } else {
            eVar.f28455c0 = i13;
        }
        m1.e eVar2 = (m1.e) this.f2021e;
        eVar2.f28492t0 = i;
        eVar2.U();
    }

    public void H(long j10, k6.t0 t0Var) {
        if (((FlutterEngine) this.f2021e) != null) {
            Log.e("FLTFireBGExecutor", "Background isolate already started.");
            return;
        }
        ci.e eVar = (ci.e) u7.f.q().f34322c;
        Handler handler = new Handler(Looper.getMainLooper());
        handler.post(new ri.a(this, eVar, handler, t0Var, j10, 0));
    }

    public ki.a I(q0.c cVar) {
        b4.e();
        StringBuilder sb2 = new StringBuilder("SurfaceProcessorNode Transform (Processor=");
        q0.f fVar = (q0.f) this.f2019c;
        sb2.append(fVar);
        sb2.append("\n   inputEdge = ");
        m mVar = cVar.f31557a;
        sb2.append(mVar);
        com.google.android.gms.internal.auth.g.e("SurfaceProcessorNode", sb2.toString());
        List<s0.b> list = cVar.f31558b;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.auth.g.e("SurfaceProcessorNode", "   outputConfig = " + ((s0.b) it.next()));
        }
        this.f2021e = new ki.a();
        for (s0.b bVar : list) {
            ki.a aVar = (ki.a) this.f2021e;
            Rect rect = bVar.f32387d;
            int i = bVar.f32389f;
            boolean z5 = bVar.f32390g;
            Matrix matrix = new Matrix(mVar.f31595b);
            RectF rectF = new RectF(rect);
            Size size = bVar.f32388e;
            matrix.postConcat(q.a(rectF, q.j(size), i, z5));
            f2.g.b(q.e(q.i(q.g(rect), i), size));
            Rect rect2 = new Rect(0, 0, size.getWidth(), size.getHeight());
            h3 h3VarB = mVar.f31600g.b();
            h3VarB.f28250b = size;
            aVar.put(bVar, new m(bVar.f32385b, bVar.f32386c, h3VarB.d(), matrix, false, rect2, mVar.i - i, -1, mVar.f31598e != z5));
        }
        o2 o2VarD = mVar.d((f0) this.f2020d, true);
        if (fVar.f31570f.get()) {
            o2VarD.d();
        } else {
            fVar.b(new c0(16, fVar, o2VarD), new j2(o2VarD, 1));
        }
        for (Map.Entry entry : ((ki.a) this.f2021e).entrySet()) {
            i(mVar, entry);
            ((m) entry.getValue()).a(new q0.o(this, mVar, entry, 0));
        }
        mVar.f31607o.add(new i(2, (ki.a) this.f2021e));
        return (ki.a) this.f2021e;
    }

    @Override // g0.t1
    public void J(Executor executor, s1 s1Var) {
        synchronized (((HashMap) this.f2020d)) {
            boolean zIsEmpty = ((HashMap) this.f2020d).isEmpty();
            ((HashMap) this.f2020d).put(s1Var, executor);
            if (zIsEmpty) {
                hl.d.s().execute(new n1(this, 0));
            } else {
                ((j0.d) executor).execute(new y(23, this, s1Var));
            }
        }
    }

    public void K(m1.e eVar) {
        ArrayList arrayList = (ArrayList) this.f2019c;
        arrayList.clear();
        int size = eVar.f28489q0.size();
        for (int i = 0; i < size; i++) {
            m1.d dVar = (m1.d) eVar.f28489q0.get(i);
            int[] iArr = dVar.f28478p0;
            if (iArr[0] == 3 || iArr[1] == 3) {
                arrayList.add(dVar);
            }
        }
        eVar.f28491s0.f27938a = true;
    }

    public synchronized void L(int i, int i10, long j10, long j11) {
        ((l1) this.f2019c).f30269l.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        AtomicLong atomicLong = (AtomicLong) this.f2021e;
        if (atomicLong.get() != -1 && jElapsedRealtime - atomicLong.get() <= 1800000) {
            return;
        }
        ((ra.b) this.f2020d).f(new pa.o(0, Arrays.asList(new pa.k(36301, i, 0, j10, j11, null, null, 0, i10)))).k(new com.google.android.gms.ads.identifier.c(this, jElapsedRealtime, 8));
    }

    public synchronized void a() {
        if (!((LinkedHashSet) this.f2019c).isEmpty()) {
            ((he.k) this.f2021e).e(0L);
        }
    }

    @Override // ga.a
    public Task b() {
        sb.g gVar = new sb.g();
        ((ExecutorService) this.f2021e).execute(new ed.c(4, this, gVar));
        return gVar.f32858a;
    }

    @Override // e1.n
    public void c(e1.h hVar) {
        ((j1.h) this.f2019c).d(hVar);
    }

    public /* bridge */ /* synthetic */ Object clone() {
        switch (this.f2018b) {
            case 6:
                e eVar = new e(((com.google.android.gms.internal.measurement.b) this.f2019c).clone());
                Iterator it = ((ArrayList) this.f2021e).iterator();
                while (it.hasNext()) {
                    ((ArrayList) eVar.f2021e).add(((com.google.android.gms.internal.measurement.b) it.next()).clone());
                }
                return eVar;
            default:
                return super.clone();
        }
    }

    @Override // e1.n
    public void d(e1.i iVar) throws Exception {
        boolean z5;
        x0.h hVar = (x0.h) this.f2020d;
        x0.b0 b0Var = (x0.b0) this.f2021e;
        if (b0Var.D != null) {
            try {
                b0Var.N(iVar, hVar);
                iVar.close();
                return;
            } catch (Throwable th2) {
                try {
                    iVar.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        if (b0Var.f35555s) {
            com.google.android.gms.internal.auth.g.e("Recorder", "Drop video data since recording is stopping.");
            iVar.close();
            return;
        }
        e1.i iVar2 = b0Var.V;
        if (iVar2 != null) {
            iVar2.close();
            b0Var.V = null;
            z5 = true;
        } else {
            z5 = false;
        }
        if (!iVar.r()) {
            if (z5) {
                com.google.android.gms.internal.auth.g.e("Recorder", "Dropped cached keyframe since we have new video data and have not yet received audio data.");
            }
            com.google.android.gms.internal.auth.g.e("Recorder", "Dropped video data since muxer has not yet started and data is not a keyframe.");
            e1.c0 c0Var = b0Var.G;
            c0Var.i.execute(new p(c0Var, 3));
            iVar.close();
            return;
        }
        b0Var.V = iVar;
        if (!b0Var.n() || !b0Var.W.g()) {
            com.google.android.gms.internal.auth.g.e("Recorder", "Received video keyframe. Starting muxer...");
            b0Var.F(hVar);
        } else if (z5) {
            com.google.android.gms.internal.auth.g.e("Recorder", "Replaced cached video keyframe with newer keyframe.");
        } else {
            com.google.android.gms.internal.auth.g.e("Recorder", "Cached video keyframe while we wait for first audio sample before starting muxer.");
        }
    }

    @Override // ii.h
    public void e(Object obj, ii.g gVar) {
        if (((Context) this.f2019c) == null) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter("android.location.PROVIDERS_CHANGED");
        intentFilter.addAction("android.intent.action.PROVIDER_CHANGED");
        l lVar = new l(gVar);
        this.f2021e = lVar;
        t1.b.d((Context) this.f2019c, lVar, intentFilter);
    }

    @Override // e1.n
    public void f(a0 a0Var) {
        ((x0.b0) this.f2021e).H = a0Var;
    }

    @Override // e1.n
    public void g() {
        ((j1.h) this.f2019c).b(null);
    }

    public Boolean h(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        ComponentName componentNameResolveActivity = intent.resolveActivity(((Context) ((a0) this.f2020d).f13c).getPackageManager());
        return (componentNameResolveActivity == null ? null : componentNameResolveActivity.toShortString()) == null ? Boolean.FALSE : Boolean.valueOf(!"{com.android.fallback/com.android.fallback.Fallback}".equals(r3));
    }

    public void i(m mVar, Map.Entry entry) {
        m mVar2 = (m) entry.getValue();
        com.google.android.gms.internal.auth.g.e("SurfaceProcessorNode", "     -> outputEdge = " + mVar2);
        a0.j jVar = null;
        a0.j jVar2 = new a0.j(mVar.f31600g.f19677a, ((s0.b) entry.getKey()).f32387d, mVar.f31596c ? (f0) this.f2020d : null, ((s0.b) entry.getKey()).f32389f, ((s0.b) entry.getKey()).f32390g);
        int i = ((s0.b) entry.getKey()).f32386c;
        mVar2.getClass();
        b4.e();
        mVar2.b();
        f2.g.h("Consumer can only be linked once.", !mVar2.f31602j);
        mVar2.f31602j = true;
        q0.l lVar = mVar2.f31604l;
        k0.j.a(k0.j.j(lVar.c(), new q0.k(mVar2, lVar, i, jVar2, jVar), hl.d.s()), new l6.i(25, this, mVar2, false), hl.d.s());
    }

    @Override // ii.h
    public void k(Object obj) {
        l lVar;
        Context context = (Context) this.f2019c;
        if (context == null || (lVar = (l) this.f2021e) == null) {
            return;
        }
        context.unregisterReceiver(lVar);
    }

    @Override // oe.k
    public Object l() {
        try {
            return ((oe.d) this.f2019c).j((Class) this.f2020d);
        } catch (Exception e3) {
            throw new RuntimeException("Unable to invoke no-args constructor for " + ((Type) this.f2021e) + ". Registering an InstanceCreator with Gson for this type may fix this problem.", e3);
        }
    }

    public void m(q4.m mVar, r9 r9Var) {
        q4.a0[] a0VarArr = (q4.a0[]) this.f2020d;
        for (int i = 0; i < a0VarArr.length; i++) {
            r9Var.a();
            r9Var.b();
            q4.a0 a0VarP = mVar.P(r9Var.f9763d, 3);
            j3.o oVar = (j3.o) ((List) this.f2019c).get(i);
            String str = oVar.f26335n;
            h5.j("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption MIME type provided: %s", str);
            String str2 = oVar.f26323a;
            if (str2 == null) {
                r9Var.b();
                str2 = (String) r9Var.f9764e;
            }
            j3.n nVar = new j3.n();
            nVar.f26281a = str2;
            nVar.f26291l = j3.c0.n("video/mp2t");
            nVar.f26292m = j3.c0.n(str);
            nVar.f26285e = oVar.f26327e;
            nVar.f26284d = oVar.f26326d;
            nVar.J = oVar.K;
            nVar.f26295p = oVar.f26338q;
            pe.a.q(nVar, a0VarP);
            a0VarArr[i] = a0VarP;
        }
    }

    public void n(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        HashMap map = (HashMap) this.f2019c;
        ud.f fVar = new ud.f(byteArrayOutputStream, map, (HashMap) this.f2020d, (rd.d) this.f2021e);
        rd.d dVar = (rd.d) map.get(obj.getClass());
        if (dVar != null) {
            dVar.a(obj, fVar);
        } else {
            throw new rd.b("No encoder for " + obj.getClass());
        }
    }

    public void o(Intent intent, CountDownLatch countDownLatch) {
        if (((FlutterEngine) this.f2021e) == null) {
            Log.i("FLTFireBGExecutor", "A background message could not be handled in Dart as no onBackgroundMessage handler has been registered.");
            return;
        }
        ri.b bVar = countDownLatch != null ? new ri.b(countDownLatch) : null;
        byte[] byteArrayExtra = intent.getByteArrayExtra("notification");
        if (byteArrayExtra == null) {
            Log.e("FLTFireBGExecutor", "RemoteMessage byte array not found in Intent.");
            return;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.unmarshall(byteArrayExtra, 0, byteArrayExtra.length);
            parcelObtain.setDataPosition(0);
            HashMap mapN = a0.e.n(x.CREATOR.createFromParcel(parcelObtain));
            ii.q qVar = (ii.q) this.f2020d;
            ki.a aVar = new ki.a();
            aVar.put("userCallbackHandle", Long.valueOf(a.a.f10b.getSharedPreferences("io.flutter.firebase.messaging.callback", 0).getLong("user_callback_handle", 0L)));
            aVar.put("message", mapN);
            qVar.a("MessagingBackground#onMessage", aVar, bVar);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // k0.c
    public void onFailure(Throwable th2) {
        j1.h hVar = (j1.h) this.f2020d;
        if (th2 instanceof CancellationException) {
            f2.g.h(null, hVar.d(new m2(u.o(new StringBuilder(), (String) this.f2021e, " cancelled."), th2)));
        } else {
            hVar.b(null);
        }
    }

    @Override // ii.o
    public void onMethodCall(ii.n nVar, ii.p pVar) {
        if (!nVar.f21315a.equals("MessagingBackground#initialized")) {
            ((hi.g) pVar).a();
            return;
        }
        ((AtomicBoolean) this.f2019c).set(true);
        List list = FlutterFirebaseMessagingBackgroundService.i;
        Log.i("FLTFireMsgService", "FlutterFirebaseMessagingBackgroundService started!");
        List list2 = FlutterFirebaseMessagingBackgroundService.i;
        synchronized (list2) {
            try {
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    FlutterFirebaseMessagingBackgroundService.f25770j.o((Intent) it.next(), null);
                }
                FlutterFirebaseMessagingBackgroundService.i.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        ((hi.g) pVar).success(Boolean.TRUE);
    }

    @Override // k0.c
    public void onSuccess(Object obj) {
        k0.j.g((ed.d) this.f2019c, (j1.h) this.f2020d);
    }

    @Override // kk.e
    public Object p(kk.f fVar, mj.a aVar) {
        Object objP = ((kk.e) this.f2019c).p(new aj.q(fVar, (t2.e) this.f2020d, (e0) this.f2021e), aVar);
        return objP == nj.a.f29512b ? objP : Unit.f27471a;
    }

    @Override // ob.t0
    public void r(String str, int i, Throwable th2, byte[] bArr, Map map) {
        ((z3) this.f2021e).y(true, i, th2, bArr, (String) this.f2019c, (ArrayList) this.f2020d);
    }

    public long s() {
        q4.h hVar = (q4.h) this.f2021e;
        if (hVar != null) {
            return hVar.f31739e;
        }
        return -1L;
    }

    public Size[] t(int i) {
        ArrayList arrayList;
        List arrayList2;
        HashMap map = (HashMap) this.f2021e;
        Size[] outputSizes = null;
        if (map.containsKey(Integer.valueOf(i))) {
            if (((Size[]) map.get(Integer.valueOf(i))) == null) {
                return null;
            }
            return (Size[]) ((Size[]) map.get(Integer.valueOf(i))).clone();
        }
        try {
            outputSizes = ((StreamConfigurationMap) ((ni.i) this.f2019c).f29407c).getOutputSizes(i);
        } catch (Throwable th2) {
            com.google.android.gms.internal.auth.g.P("StreamConfigurationMapCompat", "Failed to get output sizes for " + i, th2);
        }
        if (outputSizes == null || outputSizes.length == 0) {
            com.google.android.gms.internal.auth.g.O("StreamConfigurationMapCompat", "Retrieved output sizes array is null or empty for format " + i);
            return outputSizes;
        }
        r3.b bVar = (r3.b) this.f2020d;
        bVar.getClass();
        ArrayList arrayList3 = new ArrayList(Arrays.asList(outputSizes));
        if (((ExtraSupportedOutputSizeQuirk) bVar.f32188c) != null) {
            Size[] sizeArr = (i == 34 && "motorola".equalsIgnoreCase(Build.BRAND) && "moto e5 play".equalsIgnoreCase(Build.MODEL)) ? new Size[]{new Size(1440, 1080), new Size(VKApiCodes.CODE_CALL_REQUIRES_AUTH, 720)} : new Size[0];
            if (sizeArr.length > 0) {
                arrayList3.addAll(Arrays.asList(sizeArr));
            }
        }
        ba.a aVar = (ba.a) bVar.f32189d;
        aVar.getClass();
        if (((ExcludedSupportedSizesQuirk) w.a.f34941a.i(ExcludedSupportedSizesQuirk.class)) == null) {
            arrayList2 = new ArrayList();
        } else {
            String str = aVar.f2013a;
            String str2 = Build.BRAND;
            if ("OnePlus".equalsIgnoreCase(str2) && "OnePlus6".equalsIgnoreCase(Build.DEVICE)) {
                arrayList = new ArrayList();
                if (str.equals(CommonUrlParts.Values.FALSE_INTEGER) && i == 256) {
                    arrayList.add(new Size(4160, 3120));
                    arrayList.add(new Size(4000, 3000));
                }
            } else if ("OnePlus".equalsIgnoreCase(str2) && "OnePlus6T".equalsIgnoreCase(Build.DEVICE)) {
                arrayList = new ArrayList();
                if (str.equals(CommonUrlParts.Values.FALSE_INTEGER) && i == 256) {
                    arrayList.add(new Size(4160, 3120));
                    arrayList.add(new Size(4000, 3000));
                }
            } else if ("HUAWEI".equalsIgnoreCase(str2) && "HWANE".equalsIgnoreCase(Build.DEVICE)) {
                arrayList = new ArrayList();
                if (str.equals(CommonUrlParts.Values.FALSE_INTEGER) && (i == 34 || i == 35)) {
                    arrayList.add(new Size(720, 720));
                    arrayList.add(new Size(400, 400));
                }
            } else if (ExcludedSupportedSizesQuirk.h()) {
                arrayList = new ArrayList();
                if (str.equals(CommonUrlParts.Values.FALSE_INTEGER)) {
                    if (i == 34) {
                        arrayList.add(new Size(4128, 3096));
                        arrayList.add(new Size(4128, 2322));
                        arrayList.add(new Size(3088, 3088));
                        arrayList.add(new Size(3264, 2448));
                        arrayList.add(new Size(3264, 1836));
                        arrayList.add(new Size(2048, 1536));
                        arrayList.add(new Size(2048, 1152));
                        arrayList.add(new Size(1920, 1080));
                    } else if (i == 35) {
                        arrayList.add(new Size(4128, 2322));
                        arrayList.add(new Size(3088, 3088));
                        arrayList.add(new Size(3264, 2448));
                        arrayList.add(new Size(3264, 1836));
                        arrayList.add(new Size(2048, 1536));
                        arrayList.add(new Size(2048, 1152));
                        arrayList.add(new Size(1920, 1080));
                    }
                } else if (str.equals("1") && (i == 34 || i == 35)) {
                    arrayList.add(new Size(3264, 2448));
                    arrayList.add(new Size(3264, 1836));
                    arrayList.add(new Size(2448, 2448));
                    arrayList.add(new Size(1920, 1920));
                    arrayList.add(new Size(2048, 1536));
                    arrayList.add(new Size(2048, 1152));
                    arrayList.add(new Size(1920, 1080));
                }
            } else if (ExcludedSupportedSizesQuirk.g()) {
                arrayList = new ArrayList();
                if (str.equals(CommonUrlParts.Values.FALSE_INTEGER)) {
                    if (i == 34) {
                        arrayList.add(new Size(4128, 3096));
                        arrayList.add(new Size(4128, 2322));
                        arrayList.add(new Size(3088, 3088));
                        arrayList.add(new Size(3264, 2448));
                        arrayList.add(new Size(3264, 1836));
                        arrayList.add(new Size(2048, 1536));
                        arrayList.add(new Size(2048, 1152));
                        arrayList.add(new Size(1920, 1080));
                    } else if (i == 35) {
                        arrayList.add(new Size(2048, 1536));
                        arrayList.add(new Size(2048, 1152));
                        arrayList.add(new Size(1920, 1080));
                    }
                } else if (str.equals("1") && (i == 34 || i == 35)) {
                    arrayList.add(new Size(2576, 1932));
                    arrayList.add(new Size(2560, 1440));
                    arrayList.add(new Size(1920, 1920));
                    arrayList.add(new Size(2048, 1536));
                    arrayList.add(new Size(2048, 1152));
                    arrayList.add(new Size(1920, 1080));
                }
            } else if ("REDMI".equalsIgnoreCase(str2) && "joyeuse".equalsIgnoreCase(Build.DEVICE)) {
                arrayList = new ArrayList();
                if (str.equals(CommonUrlParts.Values.FALSE_INTEGER) && i == 256) {
                    arrayList.add(new Size(9280, 6944));
                }
            } else if (ExcludedSupportedSizesQuirk.f()) {
                ArrayList arrayList4 = new ArrayList();
                arrayList2 = arrayList4;
                if (i == 35) {
                    arrayList4.add(new Size(3840, 2160));
                    arrayList4.add(new Size(3264, 2448));
                    arrayList4.add(new Size(3200, 2400));
                    arrayList4.add(new Size(2688, 1512));
                    arrayList4.add(new Size(2592, 1944));
                    arrayList4.add(new Size(2592, 1940));
                    arrayList4.add(new Size(1920, 1440));
                    arrayList2 = arrayList4;
                }
            } else if (ExcludedSupportedSizesQuirk.e()) {
                ArrayList arrayList5 = new ArrayList();
                arrayList2 = arrayList5;
                if (i == 35) {
                    arrayList5.add(new Size(4032, 3024));
                    arrayList5.add(new Size(4000, 3000));
                    arrayList5.add(new Size(3264, 2448));
                    arrayList5.add(new Size(3200, 2400));
                    arrayList5.add(new Size(3024, 3024));
                    arrayList5.add(new Size(2976, 2976));
                    arrayList5.add(new Size(2448, 2448));
                    arrayList2 = arrayList5;
                }
            } else {
                com.google.android.gms.internal.auth.g.O("ExcludedSupportedSizesQuirk", "Cannot retrieve list of supported sizes to exclude on this device.");
                arrayList2 = Collections.EMPTY_LIST;
            }
            arrayList2 = arrayList;
        }
        if (!arrayList2.isEmpty()) {
            arrayList3.removeAll(arrayList2);
        }
        if (arrayList3.isEmpty()) {
            com.google.android.gms.internal.auth.g.O("OutputSizesCorrector", "Sizes array becomes empty after excluding problematic output sizes.");
        }
        Size[] sizeArr2 = (Size[]) arrayList3.toArray(new Size[0]);
        map.put(Integer.valueOf(i), sizeArr2);
        return (Size[]) sizeArr2.clone();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x04bf  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x04ec  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0500  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0516  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0592  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x039b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:243:0x03c2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:253:0x052c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x023b  */
    /* JADX WARN: Type inference failed for: r0v104 */
    /* JADX WARN: Type inference failed for: r0v105, types: [int] */
    /* JADX WARN: Type inference failed for: r0v179 */
    /* JADX WARN: Type inference failed for: r0v180 */
    /* JADX WARN: Type inference failed for: r0v181 */
    /* JADX WARN: Type inference failed for: r0v182 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean u() {
        /*
            Method dump skipped, instruction units count: 1453
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: bb.e.u():boolean");
    }

    @Override // g0.t1
    public void v(s1 s1Var) {
        synchronized (((HashMap) this.f2020d)) {
            ((HashMap) this.f2020d).remove(s1Var);
            if (((HashMap) this.f2020d).isEmpty()) {
                hl.d.s().execute(new n1(this, 1));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void w(p3.h r8, android.net.Uri r9, java.util.Map r10, long r11, long r13, i4.v0 r15) throws i4.k1 {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: bb.e.w(p3.h, android.net.Uri, java.util.Map, long, long, i4.v0):void");
    }

    public Boolean x(Map map, String str, Boolean bool) {
        if (((Activity) this.f2021e) == null) {
            throw new bj.b();
        }
        Intent intentPutExtra = new Intent("android.intent.action.VIEW").setData(Uri.parse(str)).putExtra("com.android.browser.headers", q(map));
        if (bool.booleanValue() && Build.VERSION.SDK_INT >= 30) {
            intentPutExtra.addFlags(1024);
        }
        try {
            ((Activity) this.f2021e).startActivity(intentPutExtra);
            return Boolean.TRUE;
        } catch (ActivityNotFoundException unused) {
            return Boolean.FALSE;
        }
    }

    public boolean y(int i, m1.d dVar, p1.e eVar) {
        n1.b bVar = (n1.b) this.f2020d;
        int[] iArr = dVar.f28478p0;
        int[] iArr2 = dVar.f28482t;
        bVar.f28965a = iArr[0];
        bVar.f28966b = iArr[1];
        bVar.f28967c = dVar.q();
        bVar.f28968d = dVar.k();
        bVar.i = false;
        bVar.f28973j = i;
        boolean z5 = bVar.f28965a == 3;
        boolean z10 = bVar.f28966b == 3;
        boolean z11 = z5 && dVar.W > 0.0f;
        boolean z12 = z10 && dVar.W > 0.0f;
        if (z11 && iArr2[0] == 4) {
            bVar.f28965a = 1;
        }
        if (z12 && iArr2[1] == 4) {
            bVar.f28966b = 1;
        }
        eVar.b(dVar, bVar);
        dVar.O(bVar.f28969e);
        dVar.L(bVar.f28970f);
        dVar.E = bVar.f28972h;
        dVar.I(bVar.f28971g);
        bVar.f28973j = 0;
        return bVar.i;
    }

    public Boolean z(String str, Boolean bool, bj.e eVar, bj.a aVar) {
        if (((Activity) this.f2021e) == null) {
            throw new bj.b();
        }
        Bundle bundleQ = q(eVar.f2168c);
        if (bool.booleanValue()) {
            Iterator it = eVar.f2168c.keySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    String lowerCase = ((String) it.next()).toLowerCase(Locale.US);
                    lowerCase.getClass();
                    switch (lowerCase) {
                    }
                } else {
                    Uri uri = Uri.parse(str);
                    Activity activity = (Activity) this.f2021e;
                    b7 b7Var = new b7();
                    ((Intent) b7Var.f3658c).putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", aVar.f2161a.booleanValue() ? 1 : 0);
                    l6.i iVarA = b7Var.a();
                    Intent intent = (Intent) iVarA.f27978c;
                    intent.putExtra("com.android.browser.headers", bundleQ);
                    try {
                        intent.setData(uri);
                        activity.startActivity(intent, (Bundle) iVarA.f27979d);
                        return Boolean.TRUE;
                    } catch (ActivityNotFoundException unused) {
                    }
                }
            }
        }
        Activity activity2 = (Activity) this.f2021e;
        boolean zBooleanValue = eVar.f2166a.booleanValue();
        boolean zBooleanValue2 = eVar.f2167b.booleanValue();
        int i = WebViewActivity.f25779f;
        try {
            ((Activity) this.f2021e).startActivity(new Intent(activity2, (Class<?>) WebViewActivity.class).putExtra("url", str).putExtra("enableJavaScript", zBooleanValue).putExtra("enableDomStorage", zBooleanValue2).putExtra("com.android.browser.headers", bundleQ));
            return Boolean.TRUE;
        } catch (ActivityNotFoundException unused2) {
            return Boolean.FALSE;
        }
    }

    public /* synthetic */ e(int i, boolean z5) {
        this.f2018b = i;
    }

    public /* synthetic */ e(Object obj, Object obj2, Object obj3, int i) {
        this.f2018b = i;
        this.f2019c = obj;
        this.f2020d = obj2;
        this.f2021e = obj3;
    }

    public /* synthetic */ e(ka.k kVar) {
        this.f2018b = 2;
        this.f2019c = (String) kVar.f27324c;
        this.f2020d = (String) kVar.f27325d;
        this.f2021e = (tw) kVar.f27326e;
    }

    public e(Context context, int i) {
        this.f2018b = i;
        switch (i) {
            case 5:
                a0 a0Var = new a0(3, context);
                this.f2019c = context;
                this.f2020d = a0Var;
                break;
            default:
                ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
                this.f2020d = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
                this.f2021e = Executors.newSingleThreadExecutor();
                this.f2019c = context;
                scheduledExecutorServiceNewSingleThreadScheduledExecutor.scheduleAtFixedRate(new ac.g(5, this), 0L, 86400L, TimeUnit.SECONDS);
                break;
        }
    }

    public e(Context context, l1 l1Var) {
        this.f2018b = 17;
        this.f2021e = new AtomicLong(-1L);
        this.f2020d = new ra.b(context, null, ra.b.f32275m, new pa.p("measurement:api"), na.e.f29187c);
        this.f2019c = l1Var;
    }

    public e(com.google.android.gms.internal.measurement.b bVar) {
        this.f2018b = 6;
        this.f2019c = bVar;
        this.f2020d = bVar.clone();
        this.f2021e = new ArrayList();
    }

    public e(List list) {
        this.f2018b = 29;
        this.f2019c = list;
        this.f2020d = new q4.a0[list.size()];
        this.f2021e = new yd1(new s3.q(22, this));
    }

    public e(StreamConfigurationMap streamConfigurationMap, r3.b bVar) {
        this.f2018b = 24;
        this.f2021e = new HashMap();
        new HashMap();
        new HashMap();
        this.f2019c = new ni.i(15, streamConfigurationMap);
        this.f2020d = bVar;
    }

    public e(fd.g gVar, zd.d dVar, he.g gVar2, he.c cVar, Context context, he.m mVar, ScheduledExecutorService scheduledExecutorService) {
        this.f2018b = 10;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f2019c = linkedHashSet;
        this.f2021e = new he.k(gVar, dVar, gVar2, cVar, context, linkedHashSet, mVar, scheduledExecutorService);
        this.f2020d = scheduledExecutorService;
    }

    public e(int i) {
        this.f2018b = i;
        switch (i) {
            case 6:
                this.f2019c = new com.google.android.gms.internal.measurement.b("", 0L, null);
                this.f2020d = new com.google.android.gms.internal.measurement.b("", 0L, null);
                this.f2021e = new ArrayList();
                break;
            case 9:
                this.f2019c = new d0();
                this.f2020d = new HashMap();
                break;
            case 11:
                this.f2019c = new ConcurrentLinkedQueue();
                break;
            case 15:
                List list = Collections.EMPTY_LIST;
                this.f2019c = list;
                this.f2020d = list;
                break;
            case 21:
                this.f2019c = new AtomicBoolean(false);
                break;
            default:
                b4.k kVar = b4.k.f1904b;
                this.f2019c = new HashSet();
                this.f2020d = kVar;
                break;
        }
    }

    public e(q4.n nVar) {
        this.f2018b = 12;
        this.f2019c = nVar;
    }

    public e(m1.e eVar) {
        this.f2018b = 16;
        this.f2019c = new ArrayList();
        this.f2020d = new n1.b();
        this.f2021e = eVar;
    }

    public e(f0 f0Var, q0.f fVar) {
        this.f2018b = 20;
        this.f2020d = f0Var;
        this.f2019c = fVar;
    }

    public e(k3.k[] kVarArr) {
        this.f2018b = 25;
        u3.c0 c0Var = new u3.c0();
        k3.n nVar = new k3.n();
        nVar.f26875c = 1.0f;
        nVar.f26876d = 1.0f;
        k3.h hVar = k3.h.f26859e;
        nVar.f26877e = hVar;
        nVar.f26878f = hVar;
        nVar.f26879g = hVar;
        nVar.f26880h = hVar;
        ByteBuffer byteBuffer = k3.k.f26866a;
        nVar.f26882k = byteBuffer;
        nVar.f26883l = byteBuffer;
        nVar.f26874b = -1;
        k3.k[] kVarArr2 = new k3.k[kVarArr.length + 2];
        this.f2019c = kVarArr2;
        System.arraycopy(kVarArr, 0, kVarArr2, 0, kVarArr.length);
        this.f2020d = c0Var;
        this.f2021e = nVar;
        kVarArr2[kVarArr.length] = c0Var;
        kVarArr2[kVarArr.length + 1] = nVar;
    }

    public e(Class cls, Type type) {
        Object oVar;
        this.f2018b = 19;
        this.f2020d = cls;
        this.f2021e = type;
        try {
            try {
                try {
                    Class<?> cls2 = Class.forName("sun.misc.Unsafe");
                    Field declaredField = cls2.getDeclaredField("theUnsafe");
                    declaredField.setAccessible(true);
                    oVar = new oe.l(cls2.getMethod("allocateInstance", Class.class), declaredField.get(null));
                } catch (Exception unused) {
                    Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                    declaredMethod.setAccessible(true);
                    int iIntValue = ((Integer) declaredMethod.invoke(null, Object.class)).intValue();
                    Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                    declaredMethod2.setAccessible(true);
                    oVar = new oe.m(iIntValue, declaredMethod2);
                }
            } catch (Exception unused2) {
                Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                declaredMethod3.setAccessible(true);
                oVar = new oe.n(declaredMethod3);
            }
        } catch (Exception unused3) {
            oVar = new oe.o();
        }
        this.f2019c = oVar;
    }

    public e(s3.f fVar, j jVar) {
        this.f2018b = 22;
        this.f2021e = fVar;
        this.f2019c = new HashMap();
        this.f2020d = jVar;
    }

    public e(r3.b bVar) {
        this.f2018b = 23;
        this.f2021e = bVar;
        this.f2020d = new AtomicBoolean(false);
        this.f2019c = ((t.c0) bVar.f32189d).f32970e.schedule(new t.y(this, 1), 2000L, TimeUnit.MILLISECONDS);
    }
}
