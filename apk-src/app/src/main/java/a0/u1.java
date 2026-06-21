package a0;

import android.content.res.AssetManager;
import android.os.Build;
import android.util.Log;
import android.util.Range;
import g0.x2;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class u1 implements g0.t1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f227c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f228d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f229e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f230f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f231g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f232h;
    public Object i;

    public u1(List initialCameraIds, u.p cameraManager, Executor systemCallbackExecutor) {
        Intrinsics.checkNotNullParameter(initialCameraIds, "initialCameraIds");
        Intrinsics.checkNotNullParameter(cameraManager, "cameraManager");
        Intrinsics.checkNotNullParameter(systemCallbackExecutor, "systemCallbackExecutor");
        this.f228d = new Object();
        this.f229e = new CopyOnWriteArrayList();
        this.f230f = null;
        this.f226b = false;
        ArrayList arrayList = new ArrayList();
        Iterator it = initialCameraIds.iterator();
        while (it.hasNext()) {
            String primaryCameraId = (String) it.next();
            Intrinsics.checkNotNullParameter(primaryCameraId, "primaryCameraId");
            Intrinsics.checkNotNullParameter(primaryCameraId, "primaryCameraId");
            ArrayList cameraIds = kotlin.collections.s.g(primaryCameraId);
            Intrinsics.checkNotNullParameter(cameraIds, "cameraIds");
            arrayList.add(new v(cameraIds, null));
        }
        this.f227c = arrayList;
        this.f231g = cameraManager;
        this.f232h = systemCallbackExecutor;
    }

    @Override // g0.t1
    public ed.d A() {
        j1.k kVarW = i0.o.w(new s3.q(9, this));
        Intrinsics.checkNotNullExpressionValue(kVarW, "getFuture(...)");
        return kVarW;
    }

    @Override // g0.t1
    public void J(Executor executor, g0.s1 s1Var) {
        List listUnmodifiableList;
        Throwable th2;
        executor.getClass();
        s1Var.getClass();
        ((CopyOnWriteArrayList) this.f229e).add(new g0.a(executor, s1Var));
        synchronized (this.f228d) {
            try {
                if (!this.f226b && !((CopyOnWriteArrayList) this.f229e).isEmpty()) {
                    Log.i("CameraPresenceSrc", "First observer added. Starting monitoring.");
                    this.f226b = true;
                    c();
                }
                listUnmodifiableList = Collections.unmodifiableList((List) this.f227c);
                th2 = (Throwable) this.f230f;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        executor.execute(new a1.c(th2, new g0.a(executor, s1Var), listUnmodifiableList, 14));
    }

    public FileInputStream a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e3) {
            String message = e3.getMessage();
            if (message == null || !message.contains("compressed")) {
                return null;
            }
            ((i6.b) this.f228d).f();
            return null;
        }
    }

    public void b(int i, Serializable serializable) {
        ((Executor) this.f227c).execute(new d.l(this, i, serializable, 3));
    }

    public void c() {
        if (((t.w0) this.i) != null) {
            Log.w("Camera2PresenceSrc", "Monitoring already started. Unregistering existing callback.");
            d();
        }
        Log.i("Camera2PresenceSrc", "Starting system availability monitoring.");
        t.w0 w0Var = new t.w0(this);
        this.i = w0Var;
        u.p pVar = (u.p) this.f231g;
        pVar.f33976a.E((Executor) this.f232h, w0Var);
        i0.o.w(new k0.h(1, A()));
    }

    public void d() {
        Log.i("Camera2PresenceSrc", "Stopping system availability monitoring.");
        t.w0 w0Var = (t.w0) this.i;
        if (w0Var != null) {
            try {
                ((u.p) this.f231g).f33976a.I(w0Var);
                Unit unit = Unit.f27471a;
            } catch (Exception e3) {
                Log.w("Camera2PresenceSrc", "Failed to unregister system availability callback.", e3);
            } finally {
                this.i = null;
            }
        }
    }

    public void e(ArrayList arrayList, x xVar) {
        boolean z5;
        List listUnmodifiableList;
        Throwable th2;
        synchronized (this.f228d) {
            try {
                if (xVar != null) {
                    z5 = ((Throwable) this.f230f) == null || !((List) this.f227c).isEmpty();
                    this.f230f = xVar;
                    this.f227c = Collections.EMPTY_LIST;
                } else {
                    arrayList.getClass();
                    boolean z10 = (((Throwable) this.f230f) == null && ((List) this.f227c).equals(arrayList)) ? false : true;
                    this.f230f = null;
                    this.f227c = arrayList;
                    z5 = z10;
                }
                listUnmodifiableList = Collections.unmodifiableList((List) this.f227c);
                th2 = (Throwable) this.f230f;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (z5) {
            StringBuilder sb2 = new StringBuilder("Data changed. Notifying ");
            sb2.append(((CopyOnWriteArrayList) this.f229e).size());
            sb2.append(" observers. Error: ");
            sb2.append(th2 != null);
            Log.d("CameraPresenceSrc", sb2.toString());
            for (g0.a aVar : (CopyOnWriteArrayList) this.f229e) {
                aVar.f19503a.execute(new a1.c(th2, aVar, listUnmodifiableList, 14));
            }
        }
    }

    @Override // g0.t1
    public void v(g0.s1 s1Var) {
        g0.a aVar;
        s1Var.getClass();
        Iterator it = ((CopyOnWriteArrayList) this.f229e).iterator();
        while (true) {
            if (!it.hasNext()) {
                aVar = null;
                break;
            } else {
                aVar = (g0.a) it.next();
                if (aVar.f19504b.equals(s1Var)) {
                    break;
                }
            }
        }
        if (aVar != null) {
            ((CopyOnWriteArrayList) this.f229e).remove(aVar);
        }
        synchronized (this.f228d) {
            try {
                if (this.f226b && ((CopyOnWriteArrayList) this.f229e).isEmpty()) {
                    Log.i("CameraPresenceSrc", "Last observer removed. Stopping monitoring.");
                    this.f226b = false;
                    d();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public u1(ArrayList arrayList) {
        this(arrayList, kotlin.collections.b0.f27475b);
    }

    public u1(ArrayList useCases, List effects) {
        String str;
        boolean z5;
        Object next;
        String str2;
        String str3;
        String str4;
        boolean zH;
        Intrinsics.checkNotNullParameter(useCases, "useCases");
        Intrinsics.checkNotNullParameter(effects, "effects");
        Range frameRateRange = g0.n.f19676h;
        kotlin.collections.d0 requiredFeatureGroup = kotlin.collections.d0.f27478b;
        kotlin.collections.b0 preferredFeatureGroup = kotlin.collections.b0.f27475b;
        Intrinsics.checkNotNullParameter(useCases, "useCases");
        Intrinsics.checkNotNullParameter(effects, "effects");
        Intrinsics.checkNotNullParameter(frameRateRange, "frameRateRange");
        Intrinsics.checkNotNullParameter(requiredFeatureGroup, "requiredFeatureGroup");
        Intrinsics.checkNotNullParameter(preferredFeatureGroup, "preferredFeatureGroup");
        this.f227c = effects;
        this.f230f = frameRateRange;
        this.f231g = requiredFeatureGroup;
        this.f228d = preferredFeatureGroup;
        List listY = CollectionsKt.y(useCases);
        this.f229e = listY;
        this.f232h = new f2(0);
        j0.d dVarS = hl.d.s();
        Intrinsics.checkNotNullExpressionValue(dVarS, "mainThreadExecutor(...)");
        this.i = dVarS;
        if (!Intrinsics.a(frameRateRange, frameRateRange)) {
            Iterator it = listY.iterator();
            while (it.hasNext()) {
                if (((q2) it.next()).f207f.h(x2.f19803y)) {
                    throw new IllegalArgumentException("Can't set target frame rate on a UseCase (by Preview.Builder.setTargetFrameRate() or VideoCapture.Builder.setTargetFrameRate()) if the frame rate range has already been set in the SessionConfig.");
                }
            }
        }
        List list = (List) this.f228d;
        Set set = (Set) this.f231g;
        if (!set.isEmpty() || !list.isEmpty()) {
            Set set2 = set;
            ArrayList arrayList = new ArrayList(kotlin.collections.t.j(set2, 10));
            Iterator it2 = set2.iterator();
            while (it2.hasNext()) {
                arrayList.add(((b0.a) it2.next()).a());
            }
            for (d0.b bVar : CollectionsKt.y(arrayList)) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : set2) {
                    if (((b0.a) obj).a() == bVar) {
                        arrayList2.add(obj);
                    }
                }
                if (arrayList2.size() > 1) {
                    throw new IllegalArgumentException(("requiredFeatures has conflicting feature values: " + arrayList2).toString());
                }
            }
            if (CollectionsKt.y(list).size() == list.size()) {
                LinkedHashSet linkedHashSetG = CollectionsKt.G(set2, list);
                if (linkedHashSetG.isEmpty()) {
                    for (q2 q2Var : (List) this.f229e) {
                        c0.d.f2180c.getClass();
                        if (g8.g.i(q2Var) != c0.d.f2185h) {
                            if (q2Var instanceof a2) {
                                str = "Preview";
                            } else if (q2Var instanceof k1) {
                                str = "ImageCapture";
                            } else if (q2Var instanceof w0) {
                                str = "ImageAnalysis";
                            } else {
                                str = l0.f.z(q2Var) ? "VideoCapture" : "UseCase";
                            }
                            Intrinsics.checkNotNullParameter(q2Var, "<this>");
                            Iterator<E> it3 = d0.b.f15491g.iterator();
                            while (true) {
                                z5 = false;
                                if (!it3.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it3.next();
                                c0.d.f2180c.getClass();
                                int iOrdinal = ((d0.b) next).ordinal();
                                if (iOrdinal == 0) {
                                    zH = q2Var.f207f.h(g0.h1.f19581h);
                                } else if (iOrdinal == 1) {
                                    zH = q2Var.f207f.h(x2.f19803y);
                                } else if (iOrdinal == 2) {
                                    zH = q2Var.f207f.h(x2.D) || q2Var.f207f.h(x2.E);
                                } else if (iOrdinal == 3) {
                                    zH = q2Var.f207f.h(g0.g1.Q);
                                } else {
                                    throw new ij.j();
                                }
                                if (zH) {
                                    break;
                                }
                            }
                            d0.b bVar2 = (d0.b) next;
                            if (bVar2 == null) {
                                z5 = true;
                            }
                            if (!z5) {
                                StringBuilder sb2 = new StringBuilder("A ");
                                Intrinsics.b(bVar2);
                                sb2.append(bVar2.name());
                                sb2.append(" value is set to ");
                                sb2.append(str);
                                sb2.append(" despite using feature groups. Do not use APIs like ");
                                sb2.append(str);
                                sb2.append(".Builder.");
                                int iOrdinal2 = bVar2.ordinal();
                                if (iOrdinal2 == 0) {
                                    str2 = "setDynamicRange";
                                } else if (iOrdinal2 == 1) {
                                    str2 = "setTargetFrameRateRange";
                                } else if (iOrdinal2 != 2) {
                                    if (iOrdinal2 == 3) {
                                        str2 = "setOutputFormat";
                                    } else {
                                        throw new ij.j();
                                    }
                                } else if (l0.f.z(q2Var)) {
                                    str2 = "setVideoStabilizationEnabled";
                                } else {
                                    str2 = "setPreviewStabilizationEnabled";
                                }
                                sb2.append(str2);
                                sb2.append(" while using feature groups. If ");
                                int iOrdinal3 = bVar2.ordinal();
                                if (iOrdinal3 == 0) {
                                    str3 = "HDR";
                                } else if (iOrdinal3 == 1) {
                                    str3 = "60 FPS";
                                } else if (iOrdinal3 == 2) {
                                    str3 = "stabilization";
                                } else if (iOrdinal3 == 3) {
                                    str3 = "JPEG_R output format";
                                } else {
                                    throw new ij.j();
                                }
                                sb2.append(str3);
                                sb2.append(" is required, instead set ");
                                int iOrdinal4 = bVar2.ordinal();
                                if (iOrdinal4 == 0) {
                                    str4 = "GroupableFeature.HDR_HLG10";
                                } else if (iOrdinal4 == 1) {
                                    str4 = "GroupableFeature.FPS_60";
                                } else if (iOrdinal4 != 2) {
                                    if (iOrdinal4 != 3) {
                                        throw new ij.j();
                                    }
                                    str4 = "GroupableFeature.IMAGE_ULTRA_HDR";
                                } else {
                                    str4 = "GroupableFeature.PREVIEW_STABILIZATION";
                                }
                                throw new IllegalArgumentException(u.o(sb2, str4, " as either a required or preferred feature.").toString());
                            }
                        } else {
                            throw new IllegalArgumentException((q2Var + " is not supported with feature group").toString());
                        }
                    }
                    if (!((List) this.f227c).isEmpty()) {
                        throw new IllegalArgumentException("Effects aren't supported with feature group yet");
                    }
                } else {
                    throw new IllegalArgumentException(("requiredFeatures and preferredFeatures have duplicate values: " + linkedHashSetG).toString());
                }
            } else {
                throw new IllegalArgumentException(("Duplicate values in preferredFeatures(" + list + ')').toString());
            }
        }
        this.f226b = true;
    }

    public u1(AssetManager assetManager, Executor executor, i6.b bVar, String str, File file) {
        byte[] bArr;
        this.f226b = false;
        this.f227c = executor;
        this.f228d = bVar;
        this.f231g = str;
        this.f230f = file;
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            bArr = i6.c.f21172d;
        } else {
            switch (i) {
                case 24:
                case 25:
                    bArr = i6.c.f21176h;
                    break;
                case 26:
                    bArr = i6.c.f21175g;
                    break;
                case 27:
                    bArr = i6.c.f21174f;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = i6.c.f21173e;
                    break;
                default:
                    bArr = null;
                    break;
            }
        }
        this.f229e = bArr;
    }
}
