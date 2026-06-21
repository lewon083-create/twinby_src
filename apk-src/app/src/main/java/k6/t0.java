package k6;

import android.app.ActivityManager;
import android.content.Intent;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk;
import androidx.camera.camera2.internal.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.google.android.gms.internal.ads.in;
import com.google.android.gms.internal.ads.y50;
import com.google.android.gms.internal.measurement.h5;
import io.sentry.protocol.SentryThread;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ob.k2;
import ob.k3;
import ob.x1;
import q9.o2;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class t0 implements r1, kk.e, ed.b, n5.e, m4.o, k0.c, f.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static t0 f27178d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f27179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f27180c;

    public /* synthetic */ t0(int i, Object obj) {
        this.f27179b = i;
        this.f27180c = obj;
    }

    public static void c(r6.b bVar) {
        bVar.execSQL("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        bVar.execSQL("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
        bVar.execSQL("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
        bVar.execSQL("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `required_network_type` INTEGER, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB, PRIMARY KEY(`id`))");
        bVar.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
        bVar.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `WorkSpec` (`period_start_time`)");
        bVar.execSQL("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        bVar.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
        bVar.execSQL("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        bVar.execSQL("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        bVar.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
        bVar.execSQL("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        bVar.execSQL("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        bVar.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        bVar.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c103703e120ae8cc73c9248622f3cd1e')");
    }

    public static t0 i(u.i iVar) {
        DynamicRangeProfiles dynamicRangeProfilesG;
        int i = Build.VERSION.SDK_INT;
        t0 t0Var = null;
        if (i >= 33 && (dynamicRangeProfilesG = io.flutter.plugin.platform.b.g(iVar.a(CameraCharacteristics.REQUEST_AVAILABLE_DYNAMIC_RANGE_PROFILES))) != null) {
            f2.g.h("DynamicRangeProfiles can only be converted to DynamicRangesCompat on API 33 or higher.", i >= 33);
            t0Var = new t0(16, new v.c(dynamicRangeProfilesG));
        }
        return t0Var == null ? v.d.f34615a : t0Var;
    }

    public static t0 k(Intent intent) {
        ArrayList arrayList = new ArrayList();
        if (intent.getBooleanExtra("trace-startup", false)) {
            arrayList.add("--trace-startup");
        }
        if (intent.getBooleanExtra("start-paused", false)) {
            arrayList.add("--start-paused");
        }
        int intExtra = intent.getIntExtra("vm-service-port", 0);
        if (intExtra > 0) {
            arrayList.add("--vm-service-port=" + Integer.toString(intExtra));
        }
        if (intent.getBooleanExtra("disable-service-auth-codes", false)) {
            arrayList.add("--disable-service-auth-codes");
        }
        if (intent.getBooleanExtra("endless-trace-buffer", false)) {
            arrayList.add("--endless-trace-buffer");
        }
        if (intent.getBooleanExtra("use-test-fonts", false)) {
            arrayList.add("--use-test-fonts");
        }
        if (intent.getBooleanExtra("enable-dart-profiling", false)) {
            arrayList.add("--enable-dart-profiling");
        }
        if (intent.getBooleanExtra("profile-startup", false)) {
            arrayList.add("--profile-startup");
        }
        if (intent.getBooleanExtra("enable-software-rendering", false)) {
            arrayList.add("--enable-software-rendering");
        }
        if (intent.getBooleanExtra("skia-deterministic-rendering", false)) {
            arrayList.add("--skia-deterministic-rendering");
        }
        if (intent.getBooleanExtra("trace-skia", false)) {
            arrayList.add("--trace-skia");
        }
        String stringExtra = intent.getStringExtra("trace-skia-allowlist");
        if (stringExtra != null) {
            arrayList.add("--trace-skia-allowlist=".concat(stringExtra));
        }
        if (intent.getBooleanExtra("trace-systrace", false)) {
            arrayList.add("--trace-systrace");
        }
        if (intent.hasExtra("trace-to-file")) {
            arrayList.add("--trace-to-file=" + intent.getStringExtra("trace-to-file"));
        }
        if (intent.hasExtra("profile-microtasks")) {
            arrayList.add("--profile-microtasks");
        }
        if (intent.hasExtra("enable-impeller")) {
            if (intent.getBooleanExtra("enable-impeller", false)) {
                arrayList.add("--enable-impeller=true");
            } else {
                arrayList.add("--enable-impeller=false");
            }
        }
        if (intent.getBooleanExtra("enable-vulkan-validation", false)) {
            arrayList.add("--enable-vulkan-validation");
        }
        if (intent.getBooleanExtra("dump-skp-on-shader-compilation", false)) {
            arrayList.add("--dump-skp-on-shader-compilation");
        }
        if (intent.getBooleanExtra("cache-sksl", false)) {
            arrayList.add("--cache-sksl");
        }
        if (intent.getBooleanExtra("purge-persistent-cache", false)) {
            arrayList.add("--purge-persistent-cache");
        }
        if (intent.getBooleanExtra("verbose-logging", false)) {
            arrayList.add("--verbose-logging");
        }
        if (intent.hasExtra("dart-flags")) {
            arrayList.add("--dart-flags=" + intent.getStringExtra("dart-flags"));
        }
        t0 t0Var = new t0(24, false);
        t0Var.f27180c = new HashSet(arrayList);
        return t0Var;
    }

    public static l6.h n(r6.b bVar) {
        HashMap map = new HashMap(2);
        map.put("work_spec_id", new n6.a(1, "work_spec_id", "TEXT", null, true, 1));
        map.put("prerequisite_id", new n6.a(2, "prerequisite_id", "TEXT", null, true, 1));
        HashSet hashSet = new HashSet(2);
        hashSet.add(new n6.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        hashSet.add(new n6.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList("id")));
        HashSet hashSet2 = new HashSet(2);
        hashSet2.add(new n6.d("index_Dependency_work_spec_id", Arrays.asList("work_spec_id"), false));
        hashSet2.add(new n6.d("index_Dependency_prerequisite_id", Arrays.asList("prerequisite_id"), false));
        n6.e eVar = new n6.e("Dependency", map, hashSet, hashSet2);
        n6.e eVarA = n6.e.a(bVar, "Dependency");
        if (!eVar.equals(eVarA)) {
            return new l6.h(false, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + eVar + "\n Found:\n" + eVarA);
        }
        HashMap map2 = new HashMap(25);
        map2.put("id", new n6.a(1, "id", "TEXT", null, true, 1));
        map2.put(SentryThread.JsonKeys.STATE, new n6.a(0, SentryThread.JsonKeys.STATE, "INTEGER", null, true, 1));
        map2.put("worker_class_name", new n6.a(0, "worker_class_name", "TEXT", null, true, 1));
        map2.put("input_merger_class_name", new n6.a(0, "input_merger_class_name", "TEXT", null, false, 1));
        map2.put("input", new n6.a(0, "input", "BLOB", null, true, 1));
        map2.put("output", new n6.a(0, "output", "BLOB", null, true, 1));
        map2.put("initial_delay", new n6.a(0, "initial_delay", "INTEGER", null, true, 1));
        map2.put("interval_duration", new n6.a(0, "interval_duration", "INTEGER", null, true, 1));
        map2.put("flex_duration", new n6.a(0, "flex_duration", "INTEGER", null, true, 1));
        map2.put("run_attempt_count", new n6.a(0, "run_attempt_count", "INTEGER", null, true, 1));
        map2.put("backoff_policy", new n6.a(0, "backoff_policy", "INTEGER", null, true, 1));
        map2.put("backoff_delay_duration", new n6.a(0, "backoff_delay_duration", "INTEGER", null, true, 1));
        map2.put("period_start_time", new n6.a(0, "period_start_time", "INTEGER", null, true, 1));
        map2.put("minimum_retention_duration", new n6.a(0, "minimum_retention_duration", "INTEGER", null, true, 1));
        map2.put("schedule_requested_at", new n6.a(0, "schedule_requested_at", "INTEGER", null, true, 1));
        map2.put("run_in_foreground", new n6.a(0, "run_in_foreground", "INTEGER", null, true, 1));
        map2.put("out_of_quota_policy", new n6.a(0, "out_of_quota_policy", "INTEGER", null, true, 1));
        map2.put("required_network_type", new n6.a(0, "required_network_type", "INTEGER", null, false, 1));
        map2.put("requires_charging", new n6.a(0, "requires_charging", "INTEGER", null, true, 1));
        map2.put("requires_device_idle", new n6.a(0, "requires_device_idle", "INTEGER", null, true, 1));
        map2.put("requires_battery_not_low", new n6.a(0, "requires_battery_not_low", "INTEGER", null, true, 1));
        map2.put("requires_storage_not_low", new n6.a(0, "requires_storage_not_low", "INTEGER", null, true, 1));
        map2.put("trigger_content_update_delay", new n6.a(0, "trigger_content_update_delay", "INTEGER", null, true, 1));
        map2.put("trigger_max_content_delay", new n6.a(0, "trigger_max_content_delay", "INTEGER", null, true, 1));
        map2.put("content_uri_triggers", new n6.a(0, "content_uri_triggers", "BLOB", null, false, 1));
        HashSet hashSet3 = new HashSet(0);
        HashSet hashSet4 = new HashSet(2);
        hashSet4.add(new n6.d("index_WorkSpec_schedule_requested_at", Arrays.asList("schedule_requested_at"), false));
        hashSet4.add(new n6.d("index_WorkSpec_period_start_time", Arrays.asList("period_start_time"), false));
        n6.e eVar2 = new n6.e("WorkSpec", map2, hashSet3, hashSet4);
        n6.e eVarA2 = n6.e.a(bVar, "WorkSpec");
        if (!eVar2.equals(eVarA2)) {
            return new l6.h(false, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + eVar2 + "\n Found:\n" + eVarA2);
        }
        HashMap map3 = new HashMap(2);
        map3.put("tag", new n6.a(1, "tag", "TEXT", null, true, 1));
        map3.put("work_spec_id", new n6.a(2, "work_spec_id", "TEXT", null, true, 1));
        HashSet hashSet5 = new HashSet(1);
        hashSet5.add(new n6.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        HashSet hashSet6 = new HashSet(1);
        hashSet6.add(new n6.d("index_WorkTag_work_spec_id", Arrays.asList("work_spec_id"), false));
        n6.e eVar3 = new n6.e("WorkTag", map3, hashSet5, hashSet6);
        n6.e eVarA3 = n6.e.a(bVar, "WorkTag");
        if (!eVar3.equals(eVarA3)) {
            return new l6.h(false, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + eVar3 + "\n Found:\n" + eVarA3);
        }
        HashMap map4 = new HashMap(2);
        map4.put("work_spec_id", new n6.a(1, "work_spec_id", "TEXT", null, true, 1));
        map4.put("system_id", new n6.a(0, "system_id", "INTEGER", null, true, 1));
        HashSet hashSet7 = new HashSet(1);
        hashSet7.add(new n6.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        n6.e eVar4 = new n6.e("SystemIdInfo", map4, hashSet7, new HashSet(0));
        n6.e eVarA4 = n6.e.a(bVar, "SystemIdInfo");
        if (!eVar4.equals(eVarA4)) {
            return new l6.h(false, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + eVar4 + "\n Found:\n" + eVarA4);
        }
        HashMap map5 = new HashMap(2);
        map5.put("name", new n6.a(1, "name", "TEXT", null, true, 1));
        map5.put("work_spec_id", new n6.a(2, "work_spec_id", "TEXT", null, true, 1));
        HashSet hashSet8 = new HashSet(1);
        hashSet8.add(new n6.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        HashSet hashSet9 = new HashSet(1);
        hashSet9.add(new n6.d("index_WorkName_work_spec_id", Arrays.asList("work_spec_id"), false));
        n6.e eVar5 = new n6.e("WorkName", map5, hashSet8, hashSet9);
        n6.e eVarA5 = n6.e.a(bVar, "WorkName");
        if (!eVar5.equals(eVarA5)) {
            return new l6.h(false, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + eVar5 + "\n Found:\n" + eVarA5);
        }
        HashMap map6 = new HashMap(2);
        map6.put("work_spec_id", new n6.a(1, "work_spec_id", "TEXT", null, true, 1));
        map6.put("progress", new n6.a(0, "progress", "BLOB", null, true, 1));
        HashSet hashSet10 = new HashSet(1);
        hashSet10.add(new n6.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        n6.e eVar6 = new n6.e("WorkProgress", map6, hashSet10, new HashSet(0));
        n6.e eVarA6 = n6.e.a(bVar, "WorkProgress");
        if (!eVar6.equals(eVarA6)) {
            return new l6.h(false, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + eVar6 + "\n Found:\n" + eVarA6);
        }
        HashMap map7 = new HashMap(2);
        map7.put("key", new n6.a(1, "key", "TEXT", null, true, 1));
        map7.put("long_value", new n6.a(0, "long_value", "INTEGER", null, false, 1));
        n6.e eVar7 = new n6.e("Preference", map7, new HashSet(0), new HashSet(0));
        n6.e eVarA7 = n6.e.a(bVar, "Preference");
        if (eVar7.equals(eVarA7)) {
            return new l6.h(true, (String) null);
        }
        return new l6.h(false, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + eVar7 + "\n Found:\n" + eVarA7);
    }

    public static t0 v(String str) {
        return new t0(6, (TextUtils.isEmpty(str) || str.length() > 1) ? ob.u1.UNINITIALIZED : x1.e(str.charAt(0)));
    }

    @Override // m4.o
    public void a() throws IOException {
        v3.f fVar = (v3.f) this.f27180c;
        fVar.B.a();
        IOException iOException = fVar.D;
        if (iOException != null) {
            throw iOException;
        }
    }

    @Override // k6.r1
    public int b(View view) {
        return ((androidx.recyclerview.widget.i) this.f27180c).getDecoratedLeft(view) - ((ViewGroup.MarginLayoutParams) ((w0) view.getLayoutParams())).leftMargin;
    }

    @Override // n5.e
    public int d(long j10) {
        return j10 < 0 ? 0 : -1;
    }

    @Override // f.b
    public void e(Object obj) {
        Map map = (Map) obj;
        z2.h0 h0Var = (z2.h0) this.f27180c;
        String[] strArr = (String[]) map.keySet().toArray(new String[0]);
        ArrayList arrayList = new ArrayList(map.values());
        int[] iArr = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            iArr[i] = ((Boolean) arrayList.get(i)).booleanValue() ? 0 : -1;
        }
        z2.d0 d0Var = (z2.d0) h0Var.E.pollFirst();
        if (d0Var == null) {
            Log.w("FragmentManager", "No permissions were requested for " + this);
            return;
        }
        String str = d0Var.f45824b;
        int i10 = d0Var.f45825c;
        z2.t tVarW = h0Var.f45844c.w(str);
        if (tVarW != null) {
            tVarW.D(i10, strArr, iArr);
            return;
        }
        Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
    }

    @Override // n5.e
    public long f(int i) {
        h5.h(i == 0);
        return 0L;
    }

    @Override // k6.r1
    public int g() {
        return ((androidx.recyclerview.widget.i) this.f27180c).getPaddingLeft();
    }

    @Override // n5.e
    public List h(long j10) {
        return j10 >= 0 ? (List) this.f27180c : Collections.EMPTY_LIST;
    }

    @Override // n5.e
    public int l() {
        return 1;
    }

    public void m(Exception exc) {
        m3.b.f("MediaCodecAudioRenderer", "Audio sink error", exc);
        o4.v vVar = ((u3.a0) this.f27180c).K0;
        Handler handler = vVar.f29700a;
        if (handler != null) {
            handler.post(new u3.k(vVar, exc, 8));
        }
    }

    @Override // k6.r1
    public int o() {
        androidx.recyclerview.widget.i iVar = (androidx.recyclerview.widget.i) this.f27180c;
        return iVar.getWidth() - iVar.getPaddingRight();
    }

    @Override // ed.b, k0.c
    public void onFailure(Throwable th2) {
        switch (this.f27179b) {
            case 4:
                fj.z zVar = (fj.z) this.f27180c;
                if (!(th2 instanceof a0.o)) {
                    ni.l1.b(zVar, th2);
                } else {
                    ni.l1.c(null, zVar);
                }
                break;
            default:
                com.google.android.gms.internal.auth.g.P("VideoEncoderSession", "VideoEncoder configuration failed.", th2);
                ((y50) this.f27180c).l();
                break;
        }
    }

    @Override // ed.b, k0.c
    public void onSuccess(Object obj) {
        switch (this.f27179b) {
            case 4:
                ni.l1.c((a0.m0) obj, (fj.z) this.f27180c);
                break;
            default:
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v4, types: [kotlin.jvm.functions.Function2, oj.i] */
    @Override // kk.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object p(kk.f r6, mj.a r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof kk.a
            if (r0 == 0) goto L13
            r0 = r7
            kk.a r0 = (kk.a) r0
            int r1 = r0.f27406o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27406o = r1
            goto L18
        L13:
            kk.a r0 = new kk.a
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f27404m
            nj.a r1 = nj.a.f29512b
            int r2 = r0.f27406o
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            lk.h r6 = r0.f27403l
            com.google.android.gms.internal.measurement.h5.E(r7)     // Catch: java.lang.Throwable -> L29
            goto L54
        L29:
            r7 = move-exception
            goto L60
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            com.google.android.gms.internal.measurement.h5.E(r7)
            lk.h r7 = new lk.h
            kotlin.coroutines.CoroutineContext r2 = r0.getContext()
            r7.<init>(r6, r2)
            r0.f27403l = r7     // Catch: java.lang.Throwable -> L5e
            r0.f27406o = r3     // Catch: java.lang.Throwable -> L5e
            java.lang.Object r6 = r5.f27180c     // Catch: java.lang.Throwable -> L5e
            oj.i r6 = (oj.i) r6     // Catch: java.lang.Throwable -> L5e
            java.lang.Object r6 = r6.invoke(r7, r0)     // Catch: java.lang.Throwable -> L5e
            if (r6 != r1) goto L4e
            goto L50
        L4e:
            kotlin.Unit r6 = kotlin.Unit.f27471a     // Catch: java.lang.Throwable -> L5e
        L50:
            if (r6 != r1) goto L53
            return r1
        L53:
            r6 = r7
        L54:
            r6.releaseIntercepted()
            kotlin.Unit r6 = kotlin.Unit.f27471a
            return r6
        L5a:
            r4 = r7
            r7 = r6
            r6 = r4
            goto L60
        L5e:
            r6 = move-exception
            goto L5a
        L60:
            r6.releaseIntercepted()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: k6.t0.p(kk.f, mj.a):java.lang.Object");
    }

    public void q() {
        k3 k3Var = (k3) this.f27180c;
        k3Var.C();
        ob.l1 l1Var = (ob.l1) k3Var.f15951b;
        ob.z0 z0Var = l1Var.f30264f;
        ob.l1.h(z0Var);
        ua.a aVar = l1Var.f30269l;
        aVar.getClass();
        if (z0Var.M(System.currentTimeMillis())) {
            ob.z0 z0Var2 = l1Var.f30264f;
            ob.l1.h(z0Var2);
            z0Var2.f30587m.b(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                ob.s0 s0Var = l1Var.f30265g;
                ob.l1.k(s0Var);
                s0Var.f30418o.f("Detected application was in foreground");
                aVar.getClass();
                w(System.currentTimeMillis());
            }
        }
    }

    @Override // k6.r1
    public View r(int i) {
        return ((androidx.recyclerview.widget.i) this.f27180c).getChildAt(i);
    }

    @Override // k6.r1
    public int s(View view) {
        return ((androidx.recyclerview.widget.i) this.f27180c).getDecoratedRight(view) + ((ViewGroup.MarginLayoutParams) ((w0) view.getLayoutParams())).rightMargin;
    }

    public void t(k9.n nVar) {
        in inVar = ((NativeAdView) this.f27180c).f2578c;
        if (inVar == null) {
            return;
        }
        try {
            if (nVar instanceof o2) {
                inVar.X3(((o2) nVar).f31954a);
            } else if (nVar == null) {
                inVar.X3(null);
            } else {
                u9.i.c("Use MediaContent provided by NativeAd.getMediaContent");
            }
        } catch (RemoteException e3) {
            u9.i.f("Unable to call setMediaContent on delegate", e3);
        }
    }

    public void u(long j10) {
        k3 k3Var = (k3) this.f27180c;
        k3Var.C();
        k3Var.G();
        ob.l1 l1Var = (ob.l1) k3Var.f15951b;
        ob.z0 z0Var = l1Var.f30264f;
        ob.l1.h(z0Var);
        if (z0Var.M(j10)) {
            ob.l1.h(z0Var);
            z0Var.f30587m.b(true);
            l1Var.q().H();
        }
        ob.l1.h(z0Var);
        z0Var.f30591q.g(j10);
        if (z0Var.f30587m.a()) {
            w(j10);
        }
    }

    public void w(long j10) {
        k3 k3Var = (k3) this.f27180c;
        k3Var.C();
        ob.l1 l1Var = (ob.l1) k3Var.f15951b;
        if (l1Var.a()) {
            ob.z0 z0Var = l1Var.f30264f;
            ob.l1.h(z0Var);
            z0Var.f30591q.g(j10);
            l1Var.f30269l.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            ob.s0 s0Var = l1Var.f30265g;
            ob.l1.k(s0Var);
            s0Var.f30418o.g(Long.valueOf(jElapsedRealtime), "Session started, time");
            long j11 = j10 / 1000;
            Long lValueOf = Long.valueOf(j11);
            k2 k2Var = l1Var.f30271n;
            ob.l1.i(k2Var);
            k2Var.N(j10, lValueOf, "auto", "_sid");
            ob.l1.h(z0Var);
            z0Var.f30592r.g(j11);
            z0Var.f30587m.b(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", j11);
            ob.l1.i(k2Var);
            k2Var.K(j10, bundle, "auto", "_s");
            String strD = z0Var.f30597w.d();
            if (TextUtils.isEmpty(strD)) {
                return;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("_ffr", strD);
            ob.l1.i(k2Var);
            k2Var.K(j10, bundle2, "auto", "_ssr");
        }
    }

    public /* synthetic */ t0(int i, boolean z5) {
        this.f27179b = i;
    }

    public t0(int i) {
        this.f27179b = i;
        switch (i) {
            case 9:
                this.f27180c = new Object();
                new Handler(Looper.getMainLooper(), new la.j(1, this));
                break;
            case 19:
                this.f27180c = (ExtraSupportedSurfaceCombinationsQuirk) w.a.f34941a.i(ExtraSupportedSurfaceCombinationsQuirk.class);
                break;
            case 20:
                this.f27180c = (ExtraCroppingQuirk) w.a.f34941a.i(ExtraCroppingQuirk.class);
                break;
            case 23:
                this.f27180c = new SparseArray();
                break;
            case 27:
                TimeUnit timeUnit = TimeUnit.MINUTES;
                Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
                dl.k delegate = new dl.k(cl.d.i);
                Intrinsics.checkNotNullParameter(delegate, "delegate");
                this.f27180c = delegate;
                break;
            default:
                this.f27180c = new AtomicInteger(0);
                break;
        }
    }

    public t0(boolean z5) {
        this.f27179b = 12;
        this.f27180c = new AtomicBoolean(z5);
    }

    public t0(CameraCaptureSession cameraCaptureSession, Handler handler) {
        this.f27179b = 14;
        if (Build.VERSION.SDK_INT >= 28) {
            this.f27180c = new u.f(cameraCaptureSession, null);
        } else {
            this.f27180c = new r3.b(cameraCaptureSession, new u.g(handler));
        }
    }

    public t0(TextView textView) {
        this.f27179b = 18;
        this.f27180c = new w2.g(textView);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public t0(Function2 function2) {
        this.f27179b = 1;
        this.f27180c = (oj.i) function2;
    }
}
