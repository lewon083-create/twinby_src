package ri;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import androidx.lifecycle.d0;
import androidx.lifecycle.e0;
import com.google.android.gms.internal.measurement.b4;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.x;
import ii.n;
import ii.o;
import ii.p;
import ii.q;
import ii.t;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingBackgroundService;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import k6.t0;
import m.h3;
import z2.w;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class f implements FlutterFirebasePlugin, o, t, ei.b, fi.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f32336b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public q f32337c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Activity f32338d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d0 f32339e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public e f32340f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d0 f32341g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public e f32342h;
    public x i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Map f32343j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ni.k f32344k;

    public f() {
        if (d0.f1548l == null) {
            d0.f1548l = new d0();
        }
        this.f32339e = d0.f1548l;
        if (d0.f1549m == null) {
            d0.f1549m = new d0();
        }
        this.f32341g = d0.f1549m;
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public final Task didReinitializeFirebaseCore() {
        sb.g gVar = new sb.g();
        FlutterFirebasePlugin.cachedThreadPool.execute(new oi.f(3, gVar));
        return gVar.f32858a;
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public final Task getPluginConstantsForFirebaseApp(fd.g gVar) {
        sb.g gVar2 = new sb.g();
        FlutterFirebasePlugin.cachedThreadPool.execute(new pi.c(gVar, gVar2, 3));
        return gVar2.f32858a;
    }

    @Override // fi.a
    public final void onAttachedToActivity(fi.b bVar) {
        h3 h3Var = (h3) bVar;
        ((HashSet) h3Var.f28254f).add(this);
        h3Var.b(this.f32344k);
        w wVar = (w) h3Var.f28250b;
        this.f32338d = wVar;
        if (wVar.getIntent() == null || this.f32338d.getIntent().getExtras() == null || (this.f32338d.getIntent().getFlags() & 1048576) == 1048576) {
            return;
        }
        onNewIntent(this.f32338d.getIntent());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [ri.e] */
    /* JADX WARN: Type inference failed for: r4v3, types: [androidx.lifecycle.e0, ri.e] */
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
    @Override // ei.b
    public final void onAttachedToEngine(ei.a aVar) {
        Context context = aVar.f16381a;
        Log.d("FLTFireContextHolder", "received application context.");
        a.a.f10b = context;
        q qVar = new q(aVar.f16383c, "plugins.flutter.io/firebase_messaging");
        this.f32337c = qVar;
        qVar.b(this);
        ni.k kVar = new ni.k();
        final int i = 0;
        kVar.f29418c = false;
        this.f32344k = kVar;
        ?? r42 = new e0(this) { // from class: ri.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f32335b;

            {
                this.f32335b = this;
            }

            @Override // androidx.lifecycle.e0
            public final void a(Object obj) {
                switch (i) {
                    case 0:
                        this.f32335b.f32337c.a("Messaging#onMessage", a0.e.n((x) obj), null);
                        break;
                    default:
                        this.f32335b.f32337c.a("Messaging#onTokenRefresh", (String) obj, null);
                        break;
                }
            }
        };
        this.f32340f = r42;
        final int i10 = 1;
        this.f32342h = new e0(this) { // from class: ri.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f32335b;

            {
                this.f32335b = this;
            }

            @Override // androidx.lifecycle.e0
            public final void a(Object obj) {
                switch (i10) {
                    case 0:
                        this.f32335b.f32337c.a("Messaging#onMessage", a0.e.n((x) obj), null);
                        break;
                    default:
                        this.f32335b.f32337c.a("Messaging#onTokenRefresh", (String) obj, null);
                        break;
                }
            }
        };
        this.f32339e.f(r42);
        this.f32341g.f(this.f32342h);
        FlutterFirebasePluginRegistry.registerPlugin("plugins.flutter.io/firebase_messaging", this);
    }

    @Override // fi.a
    public final void onDetachedFromActivity() {
        this.f32338d = null;
    }

    @Override // fi.a
    public final void onDetachedFromActivityForConfigChanges() {
        this.f32338d = null;
    }

    @Override // ei.b
    public final void onDetachedFromEngine(ei.a aVar) {
        this.f32341g.j(this.f32342h);
        this.f32339e.j(this.f32340f);
    }

    @Override // ii.o
    public final void onMethodCall(n nVar, p pVar) {
        Object obj;
        final int i;
        final int i10;
        final int i11;
        sb.m mVarS;
        long jIntValue;
        long jIntValue2;
        String str = nVar.f21315a;
        obj = nVar.f21316b;
        i = 2;
        i10 = 1;
        i11 = 0;
        switch (str) {
            case "Messaging#getInitialMessage":
                final sb.g gVar = new sb.g();
                FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable(this) { // from class: ri.c

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ f f32329c;

                    {
                        this.f32329c = this;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:69:0x0136 A[PHI: r1
                      0x0136: PHI (r1v10 com.google.firebase.messaging.x) = (r1v7 com.google.firebase.messaging.x), (r1v12 com.google.firebase.messaging.x) binds: [B:65:0x0123, B:67:0x012d] A[DONT_GENERATE, DONT_INLINE]] */
                    /* JADX WARN: Type inference failed for: r0v15, types: [int] */
                    /* JADX WARN: Type inference failed for: r0v19 */
                    /* JADX WARN: Type inference failed for: r0v20 */
                    /* JADX WARN: Type inference failed for: r0v21 */
                    @Override // java.lang.Runnable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final void run() {
                        /*
                            Method dump skipped, instruction units count: 370
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: ri.c.run():void");
                    }
                });
                mVarS = gVar.f32858a;
                break;
            case "Messaging#setAutoInitEnabled":
                sb.g gVar2 = new sb.g();
                FlutterFirebasePlugin.cachedThreadPool.execute(new d(this, (Map) obj, gVar2));
                mVarS = gVar2.f32858a;
                break;
            case "Messaging#deleteToken":
                sb.g gVar3 = new sb.g();
                FlutterFirebasePlugin.cachedThreadPool.execute(new oi.f(5, gVar3));
                mVarS = gVar3.f32858a;
                break;
            case "Messaging#unsubscribeFromTopic":
                sb.g gVar4 = new sb.g();
                FlutterFirebasePlugin.cachedThreadPool.execute(new d((Map) obj, gVar4, 0));
                mVarS = gVar4.f32858a;
                break;
            case "Messaging#subscribeToTopic":
                sb.g gVar5 = new sb.g();
                FlutterFirebasePlugin.cachedThreadPool.execute(new d((Map) obj, gVar5, 3));
                mVarS = gVar5.f32858a;
                break;
            case "Messaging#setDeliveryMetricsExportToBigQuery":
                sb.g gVar6 = new sb.g();
                FlutterFirebasePlugin.cachedThreadPool.execute(new d((Map) obj, gVar6, 1));
                mVarS = gVar6.f32858a;
                break;
            case "Messaging#startBackgroundIsolate":
                Map map = (Map) obj;
                Object obj2 = map.get("pluginCallbackHandle");
                Object obj3 = map.get("userCallbackHandle");
                if (obj2 instanceof Long) {
                    jIntValue = ((Long) obj2).longValue();
                } else {
                    if (!(obj2 instanceof Integer)) {
                        throw new IllegalArgumentException("Expected 'Long' or 'Integer' type for 'pluginCallbackHandle'.");
                    }
                    jIntValue = ((Integer) obj2).intValue();
                }
                if (obj3 instanceof Long) {
                    jIntValue2 = ((Long) obj3).longValue();
                } else {
                    if (!(obj3 instanceof Integer)) {
                        throw new IllegalArgumentException("Expected 'Long' or 'Integer' type for 'userCallbackHandle'.");
                    }
                    jIntValue2 = ((Integer) obj3).intValue();
                }
                Activity activity = this.f32338d;
                t0 t0VarK = activity != null ? t0.k(activity.getIntent()) : null;
                List list = FlutterFirebaseMessagingBackgroundService.i;
                Context context = a.a.f10b;
                if (context == null) {
                    Log.e("FLTFireBGExecutor", "Context is null, cannot continue.");
                } else {
                    context.getSharedPreferences("io.flutter.firebase.messaging.callback", 0).edit().putLong("callback_handle", jIntValue).apply();
                }
                a.a.f10b.getSharedPreferences("io.flutter.firebase.messaging.callback", 0).edit().putLong("user_callback_handle", jIntValue2).apply();
                if (FlutterFirebaseMessagingBackgroundService.f25770j != null) {
                    Log.w("FLTFireMsgService", "Attempted to start a duplicate background isolate. Returning...");
                } else {
                    bb.e eVar = new bb.e(21);
                    FlutterFirebaseMessagingBackgroundService.f25770j = eVar;
                    eVar.H(jIntValue, t0VarK);
                }
                mVarS = b4.s(null);
                break;
            case "Messaging#sendMessage":
                sb.g gVar7 = new sb.g();
                FlutterFirebasePlugin.cachedThreadPool.execute(new d((Map) obj, gVar7, 4));
                mVarS = gVar7.f32858a;
                break;
            case "Messaging#requestPermission":
                if (Build.VERSION.SDK_INT < 33) {
                    final sb.g gVar8 = new sb.g();
                    FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable(this) { // from class: ri.c

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        public final /* synthetic */ f f32329c;

                        {
                            this.f32329c = this;
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Removed duplicated region for block: B:69:0x0136 A[PHI: r1
                          0x0136: PHI (r1v10 com.google.firebase.messaging.x) = (r1v7 com.google.firebase.messaging.x), (r1v12 com.google.firebase.messaging.x) binds: [B:65:0x0123, B:67:0x012d] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Type inference failed for: r0v15, types: [int] */
                        /* JADX WARN: Type inference failed for: r0v19 */
                        /* JADX WARN: Type inference failed for: r0v20 */
                        /* JADX WARN: Type inference failed for: r0v21 */
                        @Override // java.lang.Runnable
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final void run() {
                            /*
                                Method dump skipped, instruction units count: 370
                                To view this dump change 'Code comments level' option to 'DEBUG'
                            */
                            throw new UnsupportedOperationException("Method not decompiled: ri.c.run():void");
                        }
                    });
                    mVarS = gVar8.f32858a;
                    break;
                } else {
                    final sb.g gVar9 = new sb.g();
                    FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable(this) { // from class: ri.c

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        public final /* synthetic */ f f32329c;

                        {
                            this.f32329c = this;
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Removed duplicated region for block: B:69:0x0136 A[PHI: r1
                          0x0136: PHI (r1v10 com.google.firebase.messaging.x) = (r1v7 com.google.firebase.messaging.x), (r1v12 com.google.firebase.messaging.x) binds: [B:65:0x0123, B:67:0x012d] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Type inference failed for: r0v15, types: [int] */
                        /* JADX WARN: Type inference failed for: r0v19 */
                        /* JADX WARN: Type inference failed for: r0v20 */
                        /* JADX WARN: Type inference failed for: r0v21 */
                        @Override // java.lang.Runnable
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final void run() {
                            /*
                                Method dump skipped, instruction units count: 370
                                To view this dump change 'Code comments level' option to 'DEBUG'
                            */
                            throw new UnsupportedOperationException("Method not decompiled: ri.c.run():void");
                        }
                    });
                    mVarS = gVar9.f32858a;
                    break;
                }
                break;
            case "Messaging#getNotificationSettings":
                final sb.g gVar10 = new sb.g();
                FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable(this) { // from class: ri.c

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ f f32329c;

                    {
                        this.f32329c = this;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:69:0x0136 A[PHI: r1
                      0x0136: PHI (r1v10 com.google.firebase.messaging.x) = (r1v7 com.google.firebase.messaging.x), (r1v12 com.google.firebase.messaging.x) binds: [B:65:0x0123, B:67:0x012d] A[DONT_GENERATE, DONT_INLINE]] */
                    /* JADX WARN: Type inference failed for: r0v15, types: [int] */
                    /* JADX WARN: Type inference failed for: r0v19 */
                    /* JADX WARN: Type inference failed for: r0v20 */
                    /* JADX WARN: Type inference failed for: r0v21 */
                    @Override // java.lang.Runnable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final void run() {
                        /*
                            Method dump skipped, instruction units count: 370
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: ri.c.run():void");
                    }
                });
                mVarS = gVar10.f32858a;
                break;
            case "Messaging#getToken":
                sb.g gVar11 = new sb.g();
                FlutterFirebasePlugin.cachedThreadPool.execute(new oi.f(this, gVar11));
                mVarS = gVar11.f32858a;
                break;
            default:
                ((hi.g) pVar).a();
                return;
        }
        mVarS.addOnCompleteListener(new e8.e(this, (hi.g) pVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0054 A[PHI: r2
      0x0054: PHI (r2v2 com.google.firebase.messaging.x) = (r2v1 com.google.firebase.messaging.x), (r2v1 com.google.firebase.messaging.x), (r2v5 com.google.firebase.messaging.x) binds: [B:11:0x002b, B:13:0x0035, B:15:0x004a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // ii.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onNewIntent(android.content.Intent r8) {
        /*
            r7 = this;
            android.os.Bundle r0 = r8.getExtras()
            if (r0 != 0) goto L7
            goto L57
        L7:
            android.os.Bundle r0 = r8.getExtras()
            java.lang.String r1 = "google.message_id"
            java.lang.String r0 = r0.getString(r1)
            if (r0 != 0) goto L1d
            android.os.Bundle r0 = r8.getExtras()
            java.lang.String r1 = "message_id"
            java.lang.String r0 = r0.getString(r1)
        L1d:
            if (r0 != 0) goto L20
            goto L57
        L20:
            java.util.HashMap r1 = io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingReceiver.f25771a
            java.lang.Object r2 = r1.get(r0)
            com.google.firebase.messaging.x r2 = (com.google.firebase.messaging.x) r2
            java.lang.String r3 = "notification"
            r4 = 0
            if (r2 != 0) goto L54
            ni.i r5 = ni.i.r()
            java.util.HashMap r5 = r5.q(r0)
            if (r5 == 0) goto L54
            com.google.firebase.messaging.x r2 = a0.e.j(r5)
            java.lang.String r6 = "message"
            java.lang.Object r5 = r5.get(r6)
            java.util.Objects.requireNonNull(r5)
            java.util.Map r5 = (java.util.Map) r5
            java.lang.Object r6 = r5.get(r3)
            if (r6 != 0) goto L4d
            goto L54
        L4d:
            java.lang.Object r5 = r5.get(r3)
            java.util.Map r5 = (java.util.Map) r5
            goto L55
        L54:
            r5 = r4
        L55:
            if (r2 != 0) goto L59
        L57:
            r8 = 0
            return r8
        L59:
            r7.i = r2
            r7.f32343j = r5
            r1.remove(r0)
            java.util.HashMap r0 = a0.e.n(r2)
            com.google.firebase.messaging.w r1 = r2.f()
            if (r1 != 0) goto L71
            java.util.Map r1 = r7.f32343j
            if (r1 == 0) goto L71
            r0.put(r3, r1)
        L71:
            ii.q r1 = r7.f32337c
            java.lang.String r2 = "Messaging#onMessageOpenedApp"
            r1.a(r2, r0, r4)
            android.app.Activity r0 = r7.f32338d
            r0.setIntent(r8)
            r8 = 1
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ri.f.onNewIntent(android.content.Intent):boolean");
    }

    @Override // fi.a
    public final void onReattachedToActivityForConfigChanges(fi.b bVar) {
        h3 h3Var = (h3) bVar;
        ((HashSet) h3Var.f28254f).add(this);
        this.f32338d = (w) h3Var.f28250b;
    }
}
