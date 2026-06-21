package m;

import android.app.Activity;
import android.app.Application;
import android.app.NotificationChannel;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import android.util.Range;
import android.util.Size;
import com.baseflow.geolocator.GeolocatorLocationService;
import com.google.android.gms.internal.ads.om1;
import com.google.android.gms.internal.consent_sdk.d6;
import com.google.android.gms.internal.consent_sdk.g7;
import com.google.android.gms.internal.consent_sdk.h7;
import com.google.android.gms.internal.consent_sdk.i7;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class h3 implements h7, f2.f, ii.o, ii.h, fi.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f28250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f28251c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f28252d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f28253e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f28254f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f28255g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f28256h;

    public /* synthetic */ h3(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        this.f28250b = obj;
        this.f28251c = obj2;
        this.f28252d = obj3;
        this.f28253e = obj4;
        this.f28254f = obj5;
        this.f28255g = obj6;
        this.f28256h = obj7;
    }

    public void a(ii.s sVar) {
        ((HashSet) this.f28253e).add(sVar);
    }

    public void b(ii.u uVar) {
        ((HashSet) this.f28252d).add(uVar);
    }

    public e1.b c() {
        String strX = ((String) this.f28250b) == null ? " mimeType" : "";
        if (((g0.s2) this.f28252d) == null) {
            strX = om1.x(strX, " inputTimebase");
        }
        if (((Integer) this.f28253e) == null) {
            strX = om1.x(strX, " bitrate");
        }
        if (((Integer) this.f28254f) == null) {
            strX = om1.x(strX, " captureSampleRate");
        }
        if (((Integer) this.f28255g) == null) {
            strX = om1.x(strX, " encodeSampleRate");
        }
        if (((Integer) this.f28256h) == null) {
            strX = om1.x(strX, " channelCount");
        }
        if (!strX.isEmpty()) {
            throw new IllegalStateException("Missing required properties:".concat(strX));
        }
        String str = (String) this.f28250b;
        int iIntValue = ((Integer) this.f28251c).intValue();
        e1.b bVar = new e1.b(str, iIntValue, (g0.s2) this.f28252d, ((Integer) this.f28253e).intValue(), ((Integer) this.f28254f).intValue(), ((Integer) this.f28255g).intValue(), ((Integer) this.f28256h).intValue());
        if (Objects.equals(str, "audio/mp4a-latm") && iIntValue == -1) {
            throw new IllegalArgumentException("Encoder mime set to AAC, but no AAC profile was provided.");
        }
        return bVar;
    }

    public g0.n d() {
        String strX = ((Size) this.f28250b) == null ? " resolution" : "";
        if (((Size) this.f28251c) == null) {
            strX = strX.concat(" originalConfiguredResolution");
        }
        if (((a0.i0) this.f28252d) == null) {
            strX = om1.x(strX, " dynamicRange");
        }
        if (((Integer) this.f28253e) == null) {
            strX = om1.x(strX, " sessionType");
        }
        if (((Range) this.f28254f) == null) {
            strX = om1.x(strX, " expectedFrameRateRange");
        }
        if (((Boolean) this.f28256h) == null) {
            strX = om1.x(strX, " zslDisabled");
        }
        if (strX.isEmpty()) {
            return new g0.n((Size) this.f28250b, (Size) this.f28251c, (a0.i0) this.f28252d, ((Integer) this.f28253e).intValue(), (Range) this.f28254f, (g0.v0) this.f28255g, ((Boolean) this.f28256h).booleanValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(strX));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // ii.h
    public void e(Object obj, ii.g gVar) {
        Map map;
        g8.f fVar = (g8.f) this.f28255g;
        try {
            h8.a aVar = (h8.a) this.f28251c;
            Context context = (Context) this.f28250b;
            aVar.getClass();
            int iA = h8.a.a(context);
            boolean zBooleanValue = false;
            if ((iA == 3 || iA == 4) != true) {
                gVar.a(om1.b(5), om1.a(5));
                return;
            }
            if (((GeolocatorLocationService) this.f28254f) == null) {
                Log.e("FlutterGeolocator", "Location background service has not started correctly");
                return;
            }
            Map map2 = (Map) obj;
            if (map2 != null && map2.get("forceLocationManager") != null) {
                zBooleanValue = ((Boolean) map2.get("forceLocationManager")).booleanValue();
            }
            g8.k kVarA = g8.k.a(map2);
            g8.c cVar = null;
            cVar = null;
            if (map2 != null && (map = (Map) map2.get("foregroundNotificationConfig")) != null) {
                Map map3 = (Map) map.get("notificationIcon");
                d8.a aVar2 = map3 == null ? null : new d8.a((String) map3.get("name"), (String) map3.get("defType"), 5);
                String str = (String) map.get("notificationTitle");
                String str2 = (String) map.get("notificationChannelName");
                String str3 = (String) map.get("notificationText");
                Boolean bool = (Boolean) map.get("enableWifiLock");
                Boolean bool2 = (Boolean) map.get("enableWakeLock");
                Boolean bool3 = (Boolean) map.get("setOngoing");
                Object obj2 = map.get("color");
                cVar = new g8.c(str, str3, str2, aVar2, bool.booleanValue(), bool2.booleanValue(), bool3.booleanValue(), obj2 != null ? Integer.valueOf(((Number) obj2).intValue()) : null);
            }
            if (cVar == null) {
                Log.e("FlutterGeolocator", "Geolocator position updates started");
                Context context2 = (Context) this.f28250b;
                boolean zEquals = Boolean.TRUE.equals(Boolean.valueOf(zBooleanValue));
                fVar.getClass();
                g8.h hVarB = g8.f.b(context2, zEquals, kVarA);
                this.f28256h = hVarB;
                Activity activity = (Activity) this.f28253e;
                e8.a aVar3 = new e8.a(gVar, 2);
                e8.a aVar4 = new e8.a(gVar, 3);
                ((CopyOnWriteArrayList) fVar.f20030c).add(hVarB);
                hVarB.c(activity, aVar3, aVar4);
                return;
            }
            Log.e("FlutterGeolocator", "Geolocator position updates started using Android foreground service");
            GeolocatorLocationService geolocatorLocationService = (GeolocatorLocationService) this.f28254f;
            geolocatorLocationService.f2487e++;
            if (geolocatorLocationService.f2489g != null) {
                g8.h hVarB2 = g8.f.b(geolocatorLocationService.getApplicationContext(), Boolean.TRUE.equals(Boolean.valueOf(zBooleanValue)), kVarA);
                geolocatorLocationService.f2490h = hVarB2;
                g8.f fVar2 = geolocatorLocationService.f2489g;
                Activity activity2 = geolocatorLocationService.f2488f;
                e8.a aVar5 = new e8.a(gVar, 0);
                e8.a aVar6 = new e8.a(gVar, 1);
                ((CopyOnWriteArrayList) fVar2.f20030c).add(hVarB2);
                hVarB2.c(activity2, aVar5, aVar6);
            }
            GeolocatorLocationService geolocatorLocationService2 = (GeolocatorLocationService) this.f28254f;
            if (geolocatorLocationService2.f2492k != null) {
                Log.d("FlutterGeolocator", "Service already in foreground mode.");
                a1.e eVar = geolocatorLocationService2.f2492k;
                if (eVar != null) {
                    eVar.U(cVar, geolocatorLocationService2.f2485c);
                    geolocatorLocationService2.a(cVar);
                }
            } else {
                Log.d("FlutterGeolocator", "Start service in foreground mode.");
                Context applicationContext = geolocatorLocationService2.getApplicationContext();
                geolocatorLocationService2.f2492k = new a1.e(applicationContext, cVar);
                String str4 = (String) cVar.f20014f;
                int i = Build.VERSION.SDK_INT;
                if (i >= 26) {
                    t1.u uVar = new t1.u(applicationContext);
                    g8.a.n();
                    NotificationChannel notificationChannelC = a7.d.C(str4);
                    notificationChannelC.setLockscreenVisibility(0);
                    if (i >= 26) {
                        t1.m.b(uVar.f33393a, notificationChannelC);
                    }
                }
                geolocatorLocationService2.startForeground(75415, ((t1.l) geolocatorLocationService2.f2492k.f324d).a());
                geolocatorLocationService2.f2485c = true;
            }
            geolocatorLocationService2.a(cVar);
        } catch (f8.b unused) {
            gVar.a(om1.b(4), om1.a(4));
        }
    }

    public void f(boolean z5) {
        g8.f fVar;
        g8.f fVar2;
        Log.e("FlutterGeolocator", "Geolocator position updates stopped");
        GeolocatorLocationService geolocatorLocationService = (GeolocatorLocationService) this.f28254f;
        if (geolocatorLocationService == null || (!z5 ? geolocatorLocationService.f2486d == 0 : geolocatorLocationService.f2487e == 1)) {
            Log.e("FlutterGeolocator", "There is still another flutter engine connected, not stopping location service");
        } else {
            geolocatorLocationService.f2487e--;
            Log.d("FlutterGeolocator", "Stopping location service.");
            g8.h hVar = geolocatorLocationService.f2490h;
            if (hVar != null && (fVar2 = geolocatorLocationService.f2489g) != null) {
                ((CopyOnWriteArrayList) fVar2.f20030c).remove(hVar);
                hVar.e();
            }
            GeolocatorLocationService geolocatorLocationService2 = (GeolocatorLocationService) this.f28254f;
            if (geolocatorLocationService2.f2485c) {
                Log.d("FlutterGeolocator", "Stop service in foreground.");
                geolocatorLocationService2.stopForeground(1);
                geolocatorLocationService2.b();
                geolocatorLocationService2.f2485c = false;
                geolocatorLocationService2.f2492k = null;
            }
        }
        g8.h hVar2 = (g8.h) this.f28256h;
        if (hVar2 == null || (fVar = (g8.f) this.f28255g) == null) {
            return;
        }
        ((CopyOnWriteArrayList) fVar.f20030c).remove(hVar2);
        hVar2.e();
        this.f28256h = null;
    }

    public void g(ii.s sVar) {
        ((HashSet) this.f28253e).remove(sVar);
    }

    @Override // f2.f
    public Object get() {
        x0.k kVar = (x0.k) this.f28252d;
        d1.d dVarB = d1.e.b(kVar, (Range) this.f28256h);
        StringBuilder sb2 = new StringBuilder("Resolved VIDEO frame rates: Capture frame rate = ");
        int i = dVarB.f15515a;
        sb2.append(i);
        sb2.append("fps. Encode frame rate = ");
        int i10 = dVarB.f15516b;
        sb2.append(i10);
        sb2.append("fps.");
        com.google.android.gms.internal.auth.g.e("VidEncVdPrflRslvr", sb2.toString());
        Range range = kVar.f35630c;
        com.google.android.gms.internal.auth.g.e("VidEncVdPrflRslvr", "Using resolved VIDEO bitrate from EncoderProfiles");
        g0.j jVar = (g0.j) this.f28254f;
        int i11 = jVar.f19616c;
        int i12 = ((a0.i0) this.f28255g).f118b;
        int i13 = jVar.f19621h;
        int i14 = dVarB.f15516b;
        int i15 = jVar.f19617d;
        Size size = (Size) this.f28253e;
        int iD = d1.e.d(i11, i12, i13, i14, i15, size.getWidth(), jVar.f19618e, size.getHeight(), jVar.f19619f, range);
        int i16 = jVar.f19620g;
        String str = (String) this.f28250b;
        e1.e eVarA = d1.e.a(i16, str);
        e1.c cVarD = e1.d.d();
        cVarD.f15908a = str;
        g0.s2 s2Var = (g0.s2) this.f28251c;
        if (s2Var == null) {
            throw new NullPointerException("Null inputTimebase");
        }
        cVarD.f15915h = s2Var;
        cVarD.i = size;
        cVarD.f15914g = Integer.valueOf(iD);
        cVarD.f15911d = Integer.valueOf(i);
        cVarD.f15912e = Integer.valueOf(i10);
        cVarD.f15909b = Integer.valueOf(i16);
        cVarD.f15916j = eVarA;
        return cVarD.a();
    }

    public void h() {
        if (((ii.i) this.f28252d) == null) {
            Log.d("FlutterGeolocator", "Tried to stop listening when no MethodChannel had been initialized.");
            return;
        }
        f(false);
        ((ii.i) this.f28252d).a(null);
        this.f28252d = null;
    }

    @Override // com.google.android.gms.internal.consent_sdk.i7
    public Object j() {
        Application application = (Application) ((i7) this.f28250b).j();
        return new com.google.android.gms.internal.consent_sdk.k(application, (com.google.android.gms.internal.consent_sdk.s) ((g7) this.f28252d).j(), (com.google.android.gms.internal.consent_sdk.g) ((i7) this.f28253e).j(), (com.google.android.gms.internal.consent_sdk.p) ((d6) this.f28254f).f13360c, (com.google.android.gms.internal.consent_sdk.n) this.f28255g, (com.google.android.gms.internal.consent_sdk.a0) ((i7) this.f28256h).j());
    }

    @Override // ii.h
    public void k(Object obj) {
        f(true);
    }

    @Override // ii.o
    public void onMethodCall(ii.n nVar, ii.p pVar) {
        HashMap map;
        g8.f fVar;
        h8.a aVar;
        Object obj;
        int i;
        boolean z5;
        map = (HashMap) this.f28254f;
        fVar = (g8.f) this.f28252d;
        aVar = (h8.a) this.f28251c;
        String str = nVar.f21315a;
        obj = nVar.f21316b;
        i = 2;
        z5 = false;
        switch (str) {
            case "getCurrentPosition":
                try {
                    Context context = (Context) this.f28250b;
                    aVar.getClass();
                    int iA = h8.a.a(context);
                    if (!(iA == 3 || iA == 4)) {
                        ((hi.g) pVar).b(om1.b(5), om1.a(5), null);
                        return;
                    }
                    Map map2 = (Map) obj;
                    boolean zBooleanValue = map2.get("forceLocationManager") != null ? ((Boolean) map2.get("forceLocationManager")).booleanValue() : false;
                    g8.k kVarA = g8.k.a(map2);
                    String str2 = (String) map2.get("requestId");
                    boolean[] zArr = {false};
                    Context context2 = (Context) this.f28250b;
                    fVar.getClass();
                    g8.h hVarB = g8.f.b(context2, zBooleanValue, kVarA);
                    map.put(str2, hVarB);
                    Activity activity = (Activity) this.f28255g;
                    hi.g gVar = (hi.g) pVar;
                    e8.d dVar = new e8.d(this, zArr, hVarB, str2, gVar);
                    e8.d dVar2 = new e8.d(this, zArr, hVarB, str2, gVar);
                    ((CopyOnWriteArrayList) fVar.f20030c).add(hVarB);
                    hVarB.c(activity, dVar, dVar2);
                    return;
                } catch (f8.b unused) {
                    ((hi.g) pVar).b(om1.b(4), om1.a(4), null);
                    return;
                }
            case "getLastKnownPosition":
                try {
                    Context context3 = (Context) this.f28250b;
                    aVar.getClass();
                    int iA2 = h8.a.a(context3);
                    if (!(iA2 == 3 || iA2 == 4)) {
                        ((hi.g) pVar).b(om1.b(5), om1.a(5), null);
                        return;
                    }
                    Boolean bool = (Boolean) nVar.a("forceLocationManager");
                    Context context4 = (Context) this.f28250b;
                    if (bool != null && bool.booleanValue()) {
                        z5 = true;
                    }
                    hi.g gVar2 = (hi.g) pVar;
                    e8.e eVar = new e8.e(gVar2, 2);
                    e8.e eVar2 = new e8.e(gVar2, 3);
                    fVar.getClass();
                    g8.f.b(context4, z5, null).a(eVar, eVar2);
                    return;
                } catch (f8.b unused2) {
                    ((hi.g) pVar).b(om1.b(4), om1.a(4), null);
                    return;
                }
            case "openLocationSettings":
                Context context5 = (Context) this.f28250b;
                try {
                    Intent intent = new Intent();
                    intent.setAction("android.settings.LOCATION_SOURCE_SETTINGS");
                    intent.addCategory("android.intent.category.DEFAULT");
                    intent.addFlags(268435456);
                    intent.addFlags(1073741824);
                    intent.addFlags(8388608);
                    context5.startActivity(intent);
                    z5 = true;
                } catch (Exception unused3) {
                }
                ((hi.g) pVar).success(Boolean.valueOf(z5));
                return;
            case "openAppSettings":
                Context context6 = (Context) this.f28250b;
                try {
                    Intent intent2 = new Intent();
                    intent2.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent2.addCategory("android.intent.category.DEFAULT");
                    intent2.setData(Uri.parse("package:" + context6.getPackageName()));
                    intent2.addFlags(268435456);
                    intent2.addFlags(1073741824);
                    intent2.addFlags(8388608);
                    context6.startActivity(intent2);
                    z5 = true;
                } catch (Exception unused4) {
                }
                ((hi.g) pVar).success(Boolean.valueOf(z5));
                return;
            case "isLocationServiceEnabled":
                Context context7 = (Context) this.f28250b;
                g8.b bVar = new g8.b();
                hi.g gVar3 = (hi.g) pVar;
                bVar.f20008b = gVar3;
                if (context7 == null) {
                    fVar.getClass();
                    gVar3.b(om1.b(3), om1.a(3), null);
                }
                fVar.getClass();
                g8.f.b(context7, false, null).f(bVar);
                return;
            case "checkPermission":
                try {
                    Context context8 = (Context) this.f28250b;
                    aVar.getClass();
                    int iM = t.z.m(h8.a.a(context8));
                    if (iM == 0) {
                        i = 0;
                    } else if (iM == 1) {
                        i = 1;
                    } else if (iM != 2) {
                        if (iM != 3) {
                            throw new IndexOutOfBoundsException();
                        }
                        i = 3;
                    }
                    ((hi.g) pVar).success(Integer.valueOf(i));
                    return;
                } catch (f8.b unused5) {
                    ((hi.g) pVar).b(om1.b(4), om1.a(4), null);
                    return;
                }
            case "requestPermission":
                try {
                    aVar.d((Activity) this.f28255g, new e8.e((hi.g) pVar, 0), new e8.e((hi.g) pVar, 1));
                    return;
                } catch (f8.b unused6) {
                    ((hi.g) pVar).b(om1.b(4), om1.a(4), null);
                    return;
                }
            case "getLocationAccuracy":
                Context context9 = (Context) this.f28250b;
                ((g8.g) this.f28253e).getClass();
                if (t1.b.a(context9, "android.permission.ACCESS_FINE_LOCATION") != 0) {
                    if (t1.b.a(context9, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                        i = 1;
                    } else {
                        ((hi.g) pVar).b(om1.b(5), om1.a(5), null);
                        i = 0;
                    }
                }
                if (i != 0) {
                    ((hi.g) pVar).success(Integer.valueOf(t.z.m(i)));
                    return;
                }
                return;
            case "cancelGetCurrentPosition":
                String str3 = (String) ((Map) obj).get("requestId");
                g8.h hVar = (g8.h) map.get(str3);
                if (hVar != null) {
                    hVar.e();
                }
                map.remove(str3);
                ((hi.g) pVar).success(null);
                return;
            default:
                ((hi.g) pVar).a();
                return;
        }
    }

    public h3() {
        this.f28250b = new AtomicBoolean();
        this.f28251c = null;
        this.f28252d = new HashMap(16, 1.0f);
        this.f28253e = new HashMap(16, 1.0f);
        this.f28254f = new HashMap(16, 1.0f);
        this.f28255g = new HashMap(16, 1.0f);
        this.f28256h = null;
    }
}
