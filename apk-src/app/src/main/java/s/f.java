package s;

import a0.x;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.res.TypedArray;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.media.ImageReader;
import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.Bundle;
import android.util.Size;
import android.view.SurfaceHolder;
import f2.g;
import g0.a1;
import g0.h2;
import g0.l;
import g0.s0;
import ij.h;
import ij.t;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import k6.t0;
import kotlin.collections.s;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j;
import l7.o;
import u.i;
import u.p;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements c0.b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final e f32372j = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f32373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f32374c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p f32375d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ij.p f32376e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ij.p f32377f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ij.p f32378g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ij.p f32379h;
    public final ij.p i;

    public f(Context context, String cameraId, p cameraManagerCompat) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cameraId, "cameraId");
        Intrinsics.checkNotNullParameter(cameraManagerCompat, "cameraManagerCompat");
        this.f32373b = context;
        this.f32374c = cameraId;
        this.f32375d = cameraManagerCompat;
        final int i = 0;
        this.f32376e = h.b(new Function0(this) { // from class: s.c

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ f f32369c;

            {
                this.f32369c = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() throws x {
                String string;
                Boolean bool;
                switch (i) {
                    case 0:
                        f fVar = this.f32369c;
                        Context context2 = fVar.f32373b;
                        v0.b bVar = null;
                        v0.b bVar2 = Build.VERSION.SDK_INT >= 35 ? new v0.b(context2) : null;
                        try {
                            ServiceInfo[] serviceInfoArr = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 132).services;
                            if (serviceInfoArr != null) {
                                String str = null;
                                for (ServiceInfo serviceInfo : serviceInfoArr) {
                                    Bundle bundle = serviceInfo.metaData;
                                    if (bundle != null && (string = bundle.getString("androidx.camera.featurecombinationquery.PLAY_SERVICES_IMPL_PROVIDER_KEY")) != null) {
                                        if (str != null) {
                                            throw new IllegalStateException("Multiple Play Services CameraDeviceSetupCompat implementations found in the manifest.");
                                        }
                                        str = string;
                                    }
                                }
                                if (str != null) {
                                    try {
                                        bVar = (v0.b) Class.forName(str).getConstructor(Context.class).newInstance(context2);
                                    } catch (Exception e3) {
                                        throw new IllegalStateException("Failed to instantiate Play Services CameraDeviceSetupCompat implementation", e3);
                                    }
                                }
                            }
                            break;
                        } catch (PackageManager.NameNotFoundException unused) {
                        }
                        String str2 = fVar.f32374c;
                        ArrayList arrayList = new ArrayList();
                        if (bVar != null) {
                            arrayList.add(new v0.a(bVar.f34640a, str2));
                        }
                        if (bVar2 != null) {
                            try {
                                arrayList.add(new v0.a(bVar2.f34640a, str2));
                                break;
                            } catch (UnsupportedOperationException unused2) {
                            }
                        }
                        return new v0.a(arrayList);
                    case 1:
                        f fVar2 = this.f32369c;
                        p pVar = fVar2.f32375d;
                        CameraManager cameraManager = (CameraManager) pVar.f33976a.f32188c;
                        String str3 = fVar2.f32374c;
                        if (cameraManager.isCameraDeviceSetupSupported(str3)) {
                            return ((CameraManager) pVar.f33976a.f32188c).getCameraDeviceSetup(str3);
                        }
                        return null;
                    case 2:
                        f fVar3 = this.f32369c;
                        try {
                            return fVar3.f32375d.b(fVar3.f32374c);
                        } catch (u.a e7) {
                            throw new x(e7);
                        }
                    case 3:
                        t0 t0VarI = t0.i((i) this.f32369c.f32378g.getValue());
                        g.h("DynamicRangesCompat can only be converted to DynamicRangeProfiles on API 33 or higher.", Build.VERSION.SDK_INT >= 33);
                        return ((v.b) t0VarI.f27180c).b();
                    default:
                        Context context3 = this.f32369c.f32373b;
                        try {
                            ServiceInfo[] serviceInfoArr2 = context3.getPackageManager().getPackageInfo(context3.getPackageName(), 132).services;
                            if (serviceInfoArr2 == null) {
                                bool = Boolean.FALSE;
                            } else {
                                t tVarA = j.a(serviceInfoArr2);
                                while (true) {
                                    if (tVarA.hasNext()) {
                                        Bundle bundle2 = ((ServiceInfo) tVarA.next()).metaData;
                                        if (bundle2 != null && bundle2.getString("androidx.camera.featurecombinationquery.PLAY_SERVICES_IMPL_PROVIDER_KEY") != null) {
                                            bool = Boolean.TRUE;
                                        }
                                    } else {
                                        bool = Boolean.FALSE;
                                    }
                                }
                            }
                        } catch (PackageManager.NameNotFoundException unused3) {
                            bool = null;
                        }
                        return Boolean.valueOf(Intrinsics.a(bool, Boolean.FALSE));
                }
            }
        });
        final int i10 = 1;
        this.f32377f = h.b(new Function0(this) { // from class: s.c

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ f f32369c;

            {
                this.f32369c = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() throws x {
                String string;
                Boolean bool;
                switch (i10) {
                    case 0:
                        f fVar = this.f32369c;
                        Context context2 = fVar.f32373b;
                        v0.b bVar = null;
                        v0.b bVar2 = Build.VERSION.SDK_INT >= 35 ? new v0.b(context2) : null;
                        try {
                            ServiceInfo[] serviceInfoArr = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 132).services;
                            if (serviceInfoArr != null) {
                                String str = null;
                                for (ServiceInfo serviceInfo : serviceInfoArr) {
                                    Bundle bundle = serviceInfo.metaData;
                                    if (bundle != null && (string = bundle.getString("androidx.camera.featurecombinationquery.PLAY_SERVICES_IMPL_PROVIDER_KEY")) != null) {
                                        if (str != null) {
                                            throw new IllegalStateException("Multiple Play Services CameraDeviceSetupCompat implementations found in the manifest.");
                                        }
                                        str = string;
                                    }
                                }
                                if (str != null) {
                                    try {
                                        bVar = (v0.b) Class.forName(str).getConstructor(Context.class).newInstance(context2);
                                    } catch (Exception e3) {
                                        throw new IllegalStateException("Failed to instantiate Play Services CameraDeviceSetupCompat implementation", e3);
                                    }
                                }
                            }
                            break;
                        } catch (PackageManager.NameNotFoundException unused) {
                        }
                        String str2 = fVar.f32374c;
                        ArrayList arrayList = new ArrayList();
                        if (bVar != null) {
                            arrayList.add(new v0.a(bVar.f34640a, str2));
                        }
                        if (bVar2 != null) {
                            try {
                                arrayList.add(new v0.a(bVar2.f34640a, str2));
                                break;
                            } catch (UnsupportedOperationException unused2) {
                            }
                        }
                        return new v0.a(arrayList);
                    case 1:
                        f fVar2 = this.f32369c;
                        p pVar = fVar2.f32375d;
                        CameraManager cameraManager = (CameraManager) pVar.f33976a.f32188c;
                        String str3 = fVar2.f32374c;
                        if (cameraManager.isCameraDeviceSetupSupported(str3)) {
                            return ((CameraManager) pVar.f33976a.f32188c).getCameraDeviceSetup(str3);
                        }
                        return null;
                    case 2:
                        f fVar3 = this.f32369c;
                        try {
                            return fVar3.f32375d.b(fVar3.f32374c);
                        } catch (u.a e7) {
                            throw new x(e7);
                        }
                    case 3:
                        t0 t0VarI = t0.i((i) this.f32369c.f32378g.getValue());
                        g.h("DynamicRangesCompat can only be converted to DynamicRangeProfiles on API 33 or higher.", Build.VERSION.SDK_INT >= 33);
                        return ((v.b) t0VarI.f27180c).b();
                    default:
                        Context context3 = this.f32369c.f32373b;
                        try {
                            ServiceInfo[] serviceInfoArr2 = context3.getPackageManager().getPackageInfo(context3.getPackageName(), 132).services;
                            if (serviceInfoArr2 == null) {
                                bool = Boolean.FALSE;
                            } else {
                                t tVarA = j.a(serviceInfoArr2);
                                while (true) {
                                    if (tVarA.hasNext()) {
                                        Bundle bundle2 = ((ServiceInfo) tVarA.next()).metaData;
                                        if (bundle2 != null && bundle2.getString("androidx.camera.featurecombinationquery.PLAY_SERVICES_IMPL_PROVIDER_KEY") != null) {
                                            bool = Boolean.TRUE;
                                        }
                                    } else {
                                        bool = Boolean.FALSE;
                                    }
                                }
                            }
                        } catch (PackageManager.NameNotFoundException unused3) {
                            bool = null;
                        }
                        return Boolean.valueOf(Intrinsics.a(bool, Boolean.FALSE));
                }
            }
        });
        final int i11 = 2;
        this.f32378g = h.b(new Function0(this) { // from class: s.c

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ f f32369c;

            {
                this.f32369c = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() throws x {
                String string;
                Boolean bool;
                switch (i11) {
                    case 0:
                        f fVar = this.f32369c;
                        Context context2 = fVar.f32373b;
                        v0.b bVar = null;
                        v0.b bVar2 = Build.VERSION.SDK_INT >= 35 ? new v0.b(context2) : null;
                        try {
                            ServiceInfo[] serviceInfoArr = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 132).services;
                            if (serviceInfoArr != null) {
                                String str = null;
                                for (ServiceInfo serviceInfo : serviceInfoArr) {
                                    Bundle bundle = serviceInfo.metaData;
                                    if (bundle != null && (string = bundle.getString("androidx.camera.featurecombinationquery.PLAY_SERVICES_IMPL_PROVIDER_KEY")) != null) {
                                        if (str != null) {
                                            throw new IllegalStateException("Multiple Play Services CameraDeviceSetupCompat implementations found in the manifest.");
                                        }
                                        str = string;
                                    }
                                }
                                if (str != null) {
                                    try {
                                        bVar = (v0.b) Class.forName(str).getConstructor(Context.class).newInstance(context2);
                                    } catch (Exception e3) {
                                        throw new IllegalStateException("Failed to instantiate Play Services CameraDeviceSetupCompat implementation", e3);
                                    }
                                }
                            }
                            break;
                        } catch (PackageManager.NameNotFoundException unused) {
                        }
                        String str2 = fVar.f32374c;
                        ArrayList arrayList = new ArrayList();
                        if (bVar != null) {
                            arrayList.add(new v0.a(bVar.f34640a, str2));
                        }
                        if (bVar2 != null) {
                            try {
                                arrayList.add(new v0.a(bVar2.f34640a, str2));
                                break;
                            } catch (UnsupportedOperationException unused2) {
                            }
                        }
                        return new v0.a(arrayList);
                    case 1:
                        f fVar2 = this.f32369c;
                        p pVar = fVar2.f32375d;
                        CameraManager cameraManager = (CameraManager) pVar.f33976a.f32188c;
                        String str3 = fVar2.f32374c;
                        if (cameraManager.isCameraDeviceSetupSupported(str3)) {
                            return ((CameraManager) pVar.f33976a.f32188c).getCameraDeviceSetup(str3);
                        }
                        return null;
                    case 2:
                        f fVar3 = this.f32369c;
                        try {
                            return fVar3.f32375d.b(fVar3.f32374c);
                        } catch (u.a e7) {
                            throw new x(e7);
                        }
                    case 3:
                        t0 t0VarI = t0.i((i) this.f32369c.f32378g.getValue());
                        g.h("DynamicRangesCompat can only be converted to DynamicRangeProfiles on API 33 or higher.", Build.VERSION.SDK_INT >= 33);
                        return ((v.b) t0VarI.f27180c).b();
                    default:
                        Context context3 = this.f32369c.f32373b;
                        try {
                            ServiceInfo[] serviceInfoArr2 = context3.getPackageManager().getPackageInfo(context3.getPackageName(), 132).services;
                            if (serviceInfoArr2 == null) {
                                bool = Boolean.FALSE;
                            } else {
                                t tVarA = j.a(serviceInfoArr2);
                                while (true) {
                                    if (tVarA.hasNext()) {
                                        Bundle bundle2 = ((ServiceInfo) tVarA.next()).metaData;
                                        if (bundle2 != null && bundle2.getString("androidx.camera.featurecombinationquery.PLAY_SERVICES_IMPL_PROVIDER_KEY") != null) {
                                            bool = Boolean.TRUE;
                                        }
                                    } else {
                                        bool = Boolean.FALSE;
                                    }
                                }
                            }
                        } catch (PackageManager.NameNotFoundException unused3) {
                            bool = null;
                        }
                        return Boolean.valueOf(Intrinsics.a(bool, Boolean.FALSE));
                }
            }
        });
        final int i12 = 3;
        this.f32379h = h.b(new Function0(this) { // from class: s.c

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ f f32369c;

            {
                this.f32369c = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() throws x {
                String string;
                Boolean bool;
                switch (i12) {
                    case 0:
                        f fVar = this.f32369c;
                        Context context2 = fVar.f32373b;
                        v0.b bVar = null;
                        v0.b bVar2 = Build.VERSION.SDK_INT >= 35 ? new v0.b(context2) : null;
                        try {
                            ServiceInfo[] serviceInfoArr = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 132).services;
                            if (serviceInfoArr != null) {
                                String str = null;
                                for (ServiceInfo serviceInfo : serviceInfoArr) {
                                    Bundle bundle = serviceInfo.metaData;
                                    if (bundle != null && (string = bundle.getString("androidx.camera.featurecombinationquery.PLAY_SERVICES_IMPL_PROVIDER_KEY")) != null) {
                                        if (str != null) {
                                            throw new IllegalStateException("Multiple Play Services CameraDeviceSetupCompat implementations found in the manifest.");
                                        }
                                        str = string;
                                    }
                                }
                                if (str != null) {
                                    try {
                                        bVar = (v0.b) Class.forName(str).getConstructor(Context.class).newInstance(context2);
                                    } catch (Exception e3) {
                                        throw new IllegalStateException("Failed to instantiate Play Services CameraDeviceSetupCompat implementation", e3);
                                    }
                                }
                            }
                            break;
                        } catch (PackageManager.NameNotFoundException unused) {
                        }
                        String str2 = fVar.f32374c;
                        ArrayList arrayList = new ArrayList();
                        if (bVar != null) {
                            arrayList.add(new v0.a(bVar.f34640a, str2));
                        }
                        if (bVar2 != null) {
                            try {
                                arrayList.add(new v0.a(bVar2.f34640a, str2));
                                break;
                            } catch (UnsupportedOperationException unused2) {
                            }
                        }
                        return new v0.a(arrayList);
                    case 1:
                        f fVar2 = this.f32369c;
                        p pVar = fVar2.f32375d;
                        CameraManager cameraManager = (CameraManager) pVar.f33976a.f32188c;
                        String str3 = fVar2.f32374c;
                        if (cameraManager.isCameraDeviceSetupSupported(str3)) {
                            return ((CameraManager) pVar.f33976a.f32188c).getCameraDeviceSetup(str3);
                        }
                        return null;
                    case 2:
                        f fVar3 = this.f32369c;
                        try {
                            return fVar3.f32375d.b(fVar3.f32374c);
                        } catch (u.a e7) {
                            throw new x(e7);
                        }
                    case 3:
                        t0 t0VarI = t0.i((i) this.f32369c.f32378g.getValue());
                        g.h("DynamicRangesCompat can only be converted to DynamicRangeProfiles on API 33 or higher.", Build.VERSION.SDK_INT >= 33);
                        return ((v.b) t0VarI.f27180c).b();
                    default:
                        Context context3 = this.f32369c.f32373b;
                        try {
                            ServiceInfo[] serviceInfoArr2 = context3.getPackageManager().getPackageInfo(context3.getPackageName(), 132).services;
                            if (serviceInfoArr2 == null) {
                                bool = Boolean.FALSE;
                            } else {
                                t tVarA = j.a(serviceInfoArr2);
                                while (true) {
                                    if (tVarA.hasNext()) {
                                        Bundle bundle2 = ((ServiceInfo) tVarA.next()).metaData;
                                        if (bundle2 != null && bundle2.getString("androidx.camera.featurecombinationquery.PLAY_SERVICES_IMPL_PROVIDER_KEY") != null) {
                                            bool = Boolean.TRUE;
                                        }
                                    } else {
                                        bool = Boolean.FALSE;
                                    }
                                }
                            }
                        } catch (PackageManager.NameNotFoundException unused3) {
                            bool = null;
                        }
                        return Boolean.valueOf(Intrinsics.a(bool, Boolean.FALSE));
                }
            }
        });
        final int i13 = 4;
        this.i = h.b(new Function0(this) { // from class: s.c

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ f f32369c;

            {
                this.f32369c = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() throws x {
                String string;
                Boolean bool;
                switch (i13) {
                    case 0:
                        f fVar = this.f32369c;
                        Context context2 = fVar.f32373b;
                        v0.b bVar = null;
                        v0.b bVar2 = Build.VERSION.SDK_INT >= 35 ? new v0.b(context2) : null;
                        try {
                            ServiceInfo[] serviceInfoArr = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 132).services;
                            if (serviceInfoArr != null) {
                                String str = null;
                                for (ServiceInfo serviceInfo : serviceInfoArr) {
                                    Bundle bundle = serviceInfo.metaData;
                                    if (bundle != null && (string = bundle.getString("androidx.camera.featurecombinationquery.PLAY_SERVICES_IMPL_PROVIDER_KEY")) != null) {
                                        if (str != null) {
                                            throw new IllegalStateException("Multiple Play Services CameraDeviceSetupCompat implementations found in the manifest.");
                                        }
                                        str = string;
                                    }
                                }
                                if (str != null) {
                                    try {
                                        bVar = (v0.b) Class.forName(str).getConstructor(Context.class).newInstance(context2);
                                    } catch (Exception e3) {
                                        throw new IllegalStateException("Failed to instantiate Play Services CameraDeviceSetupCompat implementation", e3);
                                    }
                                }
                            }
                            break;
                        } catch (PackageManager.NameNotFoundException unused) {
                        }
                        String str2 = fVar.f32374c;
                        ArrayList arrayList = new ArrayList();
                        if (bVar != null) {
                            arrayList.add(new v0.a(bVar.f34640a, str2));
                        }
                        if (bVar2 != null) {
                            try {
                                arrayList.add(new v0.a(bVar2.f34640a, str2));
                                break;
                            } catch (UnsupportedOperationException unused2) {
                            }
                        }
                        return new v0.a(arrayList);
                    case 1:
                        f fVar2 = this.f32369c;
                        p pVar = fVar2.f32375d;
                        CameraManager cameraManager = (CameraManager) pVar.f33976a.f32188c;
                        String str3 = fVar2.f32374c;
                        if (cameraManager.isCameraDeviceSetupSupported(str3)) {
                            return ((CameraManager) pVar.f33976a.f32188c).getCameraDeviceSetup(str3);
                        }
                        return null;
                    case 2:
                        f fVar3 = this.f32369c;
                        try {
                            return fVar3.f32375d.b(fVar3.f32374c);
                        } catch (u.a e7) {
                            throw new x(e7);
                        }
                    case 3:
                        t0 t0VarI = t0.i((i) this.f32369c.f32378g.getValue());
                        g.h("DynamicRangesCompat can only be converted to DynamicRangeProfiles on API 33 or higher.", Build.VERSION.SDK_INT >= 33);
                        return ((v.b) t0VarI.f27180c).b();
                    default:
                        Context context3 = this.f32369c.f32373b;
                        try {
                            ServiceInfo[] serviceInfoArr2 = context3.getPackageManager().getPackageInfo(context3.getPackageName(), 132).services;
                            if (serviceInfoArr2 == null) {
                                bool = Boolean.FALSE;
                            } else {
                                t tVarA = j.a(serviceInfoArr2);
                                while (true) {
                                    if (tVarA.hasNext()) {
                                        Bundle bundle2 = ((ServiceInfo) tVarA.next()).metaData;
                                        if (bundle2 != null && bundle2.getString("androidx.camera.featurecombinationquery.PLAY_SERVICES_IMPL_PROVIDER_KEY") != null) {
                                            bool = Boolean.TRUE;
                                        }
                                    } else {
                                        bool = Boolean.FALSE;
                                    }
                                }
                            }
                        } catch (PackageManager.NameNotFoundException unused3) {
                            bool = null;
                        }
                        return Boolean.valueOf(Intrinsics.a(bool, Boolean.FALSE));
                }
            }
        });
    }

    @Override // c0.b
    public final boolean d(h2 sessionConfig) throws Exception {
        boolean zIsTerminated;
        d dVar;
        DynamicRangeProfiles dynamicRangeProfiles;
        OutputConfiguration outputConfiguration;
        Intrinsics.checkNotNullParameter(sessionConfig, "sessionConfig");
        ArrayList<l> arrayList = sessionConfig.f19583a;
        s0 s0Var = sessionConfig.f19589g;
        Intrinsics.checkNotNullExpressionValue(arrayList, "getOutputConfigs(...)");
        ArrayList<AutoCloseable> arrayList2 = new ArrayList(kotlin.collections.t.j(arrayList, 10));
        for (l lVar : arrayList) {
            if (((Boolean) this.i.getValue()).booleanValue()) {
                Intrinsics.b(lVar);
                a1 a1Var = lVar.f19641a;
                Class cls = a1Var.f19517j;
                StringBuilder sb2 = new StringBuilder("toDeferredOutputConfiguration: surface containerClass = ");
                Class cls2 = a1Var.f19517j;
                Size size = a1Var.f19516h;
                sb2.append(cls2);
                com.google.android.gms.internal.auth.g.e("FeatureCombinationQueryImpl", sb2.toString());
                if (cls == null) {
                    outputConfiguration = new OutputConfiguration(a1Var.i, size);
                } else {
                    if (size == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    outputConfiguration = new OutputConfiguration(size, cls);
                }
                dVar = new d(outputConfiguration, null);
            } else {
                Intrinsics.b(lVar);
                a1 a1Var2 = lVar.f19641a;
                Class cls3 = a1Var2.f19517j;
                long j10 = Intrinsics.a(cls3, MediaCodec.class) ? 65536L : Intrinsics.a(cls3, SurfaceHolder.class) ? 2048L : Intrinsics.a(cls3, SurfaceTexture.class) ? 256L : 0L;
                StringBuilder sb3 = new StringBuilder("toConcreteOutputConfiguration: surface containerClass = ");
                Class cls4 = a1Var2.f19517j;
                Size size2 = a1Var2.f19516h;
                sb3.append(cls4);
                sb3.append(", usageFlag = ");
                sb3.append(j10);
                com.google.android.gms.internal.auth.g.e("FeatureCombinationQueryImpl", sb3.toString());
                ImageReader imageReaderNewInstance = ImageReader.newInstance(size2.getWidth(), size2.getHeight(), a1Var2.i, 1, j10);
                Intrinsics.checkNotNullExpressionValue(imageReaderNewInstance, "newInstance(...)");
                dVar = new d(new OutputConfiguration(imageReaderNewInstance.getSurface()), imageReaderNewInstance);
            }
            if (lVar.f19641a.f19517j != null && (dynamicRangeProfiles = (DynamicRangeProfiles) this.f32379h.getValue()) != null) {
                Long lA = v.a.a(lVar.f19645e, dynamicRangeProfiles);
                if (lA == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                dVar.f32370b.setDynamicRangeProfile(lA.longValue());
            }
            arrayList2.add(dVar);
        }
        ArrayList arrayList3 = new ArrayList(kotlin.collections.t.j(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((d) it.next()).f32370b);
        }
        SessionConfiguration sessionConfiguration = new SessionConfiguration(0, arrayList3, hl.d.j(), f32372j);
        CameraDevice.CameraDeviceSetup cameraDeviceSetup = (CameraDevice.CameraDeviceSetup) this.f32377f.getValue();
        if (cameraDeviceSetup == null) {
            sessionConfiguration = null;
        } else {
            CaptureRequest.Builder builderCreateCaptureRequest = cameraDeviceSetup.createCaptureRequest(s0Var.f19747c);
            builderCreateCaptureRequest.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, s0Var.a());
            if (s0Var.c() == 2) {
                builderCreateCaptureRequest.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 2);
            }
            sessionConfiguration.setSessionParameters(builderCreateCaptureRequest.build());
        }
        if (sessionConfiguration == null) {
            return false;
        }
        int i = ((v0.a) this.f32376e.getValue()).a(sessionConfiguration).f28052c;
        StringBuilder sbM = o.m(i, "isSupported: supported = ", " for session config with ");
        StringBuilder sb4 = new StringBuilder("sessionParameters=[");
        sb4.append("fpsRange=" + s0Var.a());
        sb4.append(", previewStabilizationMode=" + s0Var.c());
        sb4.append("], outputConfigurations=[");
        Intrinsics.checkNotNullExpressionValue(arrayList, "getOutputConfigs(...)");
        int i10 = 0;
        for (Object obj : arrayList) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                s.i();
                throw null;
            }
            l lVar2 = (l) obj;
            if (i10 != 0) {
                sb4.append(StringUtils.COMMA);
            }
            StringBuilder sb5 = new StringBuilder("{format=");
            a1 a1Var3 = lVar2.f19641a;
            sb5.append(a1Var3.i);
            sb5.append(", size=");
            sb5.append(a1Var3.f19516h);
            sb5.append(", dynamicRange=");
            sb5.append(lVar2.f19645e);
            sb5.append(", class=");
            sb5.append(a1Var3.f19517j);
            sb5.append('}');
            sb4.append(sb5.toString());
            i10 = i11;
        }
        sb4.append("]");
        String string = sb4.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        sbM.append(string);
        com.google.android.gms.internal.auth.g.e("FeatureCombinationQueryImpl", sbM.toString());
        boolean z5 = i == 1;
        for (AutoCloseable autoCloseable : arrayList2) {
            if (autoCloseable instanceof AutoCloseable) {
                autoCloseable.close();
            } else if (autoCloseable instanceof ExecutorService) {
                ExecutorService executorService = (ExecutorService) autoCloseable;
                if (executorService != ForkJoinPool.commonPool() && !(zIsTerminated = executorService.isTerminated())) {
                    executorService.shutdown();
                    boolean z10 = false;
                    while (!zIsTerminated) {
                        try {
                            zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                        } catch (InterruptedException unused) {
                            if (!z10) {
                                executorService.shutdownNow();
                                z10 = true;
                            }
                        }
                    }
                    if (z10) {
                        Thread.currentThread().interrupt();
                    }
                }
            } else if (autoCloseable instanceof TypedArray) {
                ((TypedArray) autoCloseable).recycle();
            } else if (autoCloseable instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) autoCloseable).release();
            } else {
                if (!(autoCloseable instanceof MediaDrm)) {
                    throw new IllegalArgumentException();
                }
                ((MediaDrm) autoCloseable).release();
            }
        }
        return z5;
    }
}
