package ka;

import aj.g0;
import aj.i0;
import android.accounts.Account;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ClipDescription;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.PersistableBundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.Log;
import android.util.Range;
import android.util.Rational;
import android.util.TypedValue;
import androidx.lifecycle.v0;
import androidx.lifecycle.w;
import androidx.lifecycle.x;
import androidx.work.OverwritingInputMerger;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.internal.ads.dw1;
import com.google.android.gms.internal.ads.om1;
import com.google.android.gms.internal.auth.g2;
import com.google.android.gms.internal.auth.h2;
import com.google.android.gms.internal.auth.i2;
import com.google.android.gms.internal.consent_sdk.a0;
import com.google.android.gms.internal.consent_sdk.d6;
import com.google.android.gms.internal.consent_sdk.e0;
import com.google.android.gms.internal.consent_sdk.f0;
import com.google.android.gms.internal.consent_sdk.g7;
import com.google.android.gms.internal.consent_sdk.h0;
import com.google.android.gms.internal.consent_sdk.h7;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import g0.a2;
import g0.b1;
import g0.c1;
import ii.o;
import io.flutter.embedding.engine.FlutterJNI;
import io.sentry.TransactionOptions;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.IntConsumer;
import java.util.zip.Adler32;
import k9.r;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import l7.p;
import m.c0;
import ob.b3;
import ob.m2;
import ob.t0;
import org.json.JSONException;
import p3.q;
import s3.y;
import t.z;
import ti.n0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements aj.g, oa.m, h7, f2.f, b1, i2.h, ii.d, j1.i, OnCompleteListener, m2, t0, o, p3.g {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static k f27322f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f27323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f27324c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f27325d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f27326e;

    public static k J(Context context, AttributeSet attributeSet, int[] iArr, int i) {
        return new k(context, context.obtainStyledAttributes(attributeSet, iArr, i, 0));
    }

    public static synchronized k T(Context context) {
        k kVar;
        Context applicationContext = context.getApplicationContext();
        synchronized (k.class) {
            kVar = f27322f;
            if (kVar == null) {
                kVar = new k(applicationContext);
                f27322f = kVar;
            }
        }
        return kVar;
        return kVar;
    }

    public p A() {
        UUID uuid = (UUID) this.f27324c;
        u7.j jVar = (u7.j) this.f27325d;
        HashSet hashSet = (HashSet) this.f27326e;
        p pVar = new p();
        pVar.f28053a = uuid;
        pVar.f28054b = jVar;
        pVar.f28055c = hashSet;
        l7.c cVar = jVar.f34338j;
        boolean z5 = cVar.f28018h.f28021a.size() > 0 || cVar.f28014d || cVar.f28012b || cVar.f28013c;
        if (((u7.j) this.f27325d).f34345q && z5) {
            throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
        }
        this.f27324c = UUID.randomUUID();
        u7.j jVar2 = (u7.j) this.f27325d;
        u7.j jVar3 = new u7.j();
        jVar3.f34331b = 1;
        l7.f fVar = l7.f.f28023c;
        jVar3.f34334e = fVar;
        jVar3.f34335f = fVar;
        jVar3.f34338j = l7.c.i;
        jVar3.f34340l = 1;
        jVar3.f34341m = TransactionOptions.DEFAULT_DEADLINE_TIMEOUT_AUTO_TRANSACTION;
        jVar3.f34344p = -1L;
        jVar3.f34346r = 1;
        jVar3.f34330a = jVar2.f34330a;
        jVar3.f34332c = jVar2.f34332c;
        jVar3.f34331b = jVar2.f34331b;
        jVar3.f34333d = jVar2.f34333d;
        jVar3.f34334e = new l7.f(jVar2.f34334e);
        jVar3.f34335f = new l7.f(jVar2.f34335f);
        jVar3.f34336g = jVar2.f34336g;
        jVar3.f34337h = jVar2.f34337h;
        jVar3.i = jVar2.i;
        l7.c cVar2 = jVar2.f34338j;
        l7.c cVar3 = new l7.c();
        cVar3.f28011a = 1;
        cVar3.f28016f = -1L;
        cVar3.f28017g = -1L;
        cVar3.f28018h = new l7.e();
        cVar3.f28012b = cVar2.f28012b;
        cVar3.f28013c = cVar2.f28013c;
        cVar3.f28011a = cVar2.f28011a;
        cVar3.f28014d = cVar2.f28014d;
        cVar3.f28015e = cVar2.f28015e;
        cVar3.f28018h = cVar2.f28018h;
        jVar3.f34338j = cVar3;
        jVar3.f34339k = jVar2.f34339k;
        jVar3.f34340l = jVar2.f34340l;
        jVar3.f34341m = jVar2.f34341m;
        jVar3.f34342n = jVar2.f34342n;
        jVar3.f34343o = jVar2.f34343o;
        jVar3.f34344p = jVar2.f34344p;
        jVar3.f34345q = jVar2.f34345q;
        jVar3.f34346r = jVar2.f34346r;
        this.f27325d = jVar3;
        jVar3.f34330a = ((UUID) this.f27324c).toString();
        return pVar;
    }

    public SharedPreferences B(aj.h hVar) {
        Context context = (Context) this.f27325d;
        String str = hVar.f966a;
        if (str != null) {
            SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
            Intrinsics.b(sharedPreferences);
            return sharedPreferences;
        }
        SharedPreferences sharedPreferences2 = context.getSharedPreferences(context.getPackageName() + "_preferences", 0);
        Intrinsics.b(sharedPreferences2);
        return sharedPreferences2;
    }

    public void C(int i, io.flutter.view.e eVar) {
        ((FlutterJNI) this.f27325d).dispatchSemanticsAction(i, eVar);
    }

    public void D(int i, io.flutter.view.e eVar, Serializable serializable) {
        ((FlutterJNI) this.f27325d).dispatchSemanticsAction(i, eVar, serializable);
    }

    public ColorStateList E(int i) {
        int resourceId;
        ColorStateList colorStateListB;
        TypedArray typedArray = (TypedArray) this.f27325d;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListB = t1.b.b((Context) this.f27324c, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateListB;
    }

    public Drawable F(int i) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f27325d;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) ? typedArray.getDrawable(i) : a.a.i((Context) this.f27324c, resourceId);
    }

    public Typeface G(int i, int i10, c0 c0Var) {
        int resourceId = ((TypedArray) this.f27325d).getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.f27326e) == null) {
            this.f27326e = new TypedValue();
        }
        Context context = (Context) this.f27324c;
        TypedValue typedValue = (TypedValue) this.f27326e;
        ThreadLocal threadLocal = w1.j.f34987a;
        if (context.isRestricted()) {
            return null;
        }
        return w1.j.b(context, resourceId, typedValue, i10, c0Var, true, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0053, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public g0.c1 H(int r21) {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ka.k.H(int):g0.c1");
    }

    public void I(HashMap map) {
        new Handler(Looper.getMainLooper()).post(new b3(9, this, map));
    }

    public void K(int i, ti.g gVar) {
        HashMap map = new HashMap();
        map.put("adId", Integer.valueOf(i));
        map.put("eventName", "onAdFailedToLoad");
        map.put("loadAdError", gVar);
        I(map);
    }

    public void L(int i, r rVar) {
        HashMap map = new HashMap();
        map.put("adId", Integer.valueOf(i));
        map.put("eventName", "onAdLoaded");
        map.put("responseInfo", rVar == null ? null : new ti.i(rVar));
        I(map);
    }

    public void M(int i, String str, String str2) {
        HashMap map = new HashMap();
        map.put("adId", Integer.valueOf(i));
        map.put("eventName", "onAppEvent");
        map.put("name", str);
        map.put("data", str2);
        I(map);
    }

    public void N(int i, n0 n0Var) {
        HashMap map = new HashMap();
        map.put("adId", Integer.valueOf(i));
        map.put("eventName", "onRewardedAdUserEarnedReward");
        map.put("rewardItem", n0Var);
        I(map);
    }

    public void O(Activity activity, f7.k newLayoutInfo) {
        WeakHashMap weakHashMap = (WeakHashMap) this.f27326e;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(newLayoutInfo, "newLayout");
        ReentrantLock reentrantLock = (ReentrantLock) this.f27325d;
        reentrantLock.lock();
        try {
            if (newLayoutInfo.equals((f7.k) weakHashMap.get(activity))) {
                return;
            }
            reentrantLock.unlock();
            a0.b1 b1Var = (a0.b1) this.f27324c;
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(newLayoutInfo, "newLayout");
            for (i7.l this$0 : ((i7.m) b1Var.f45c).f21213b) {
                if (this$0.f21207a.equals(activity)) {
                    Intrinsics.checkNotNullParameter(newLayoutInfo, "newLayoutInfo");
                    this$0.f21209c = newLayoutInfo;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    Intrinsics.checkNotNullParameter(newLayoutInfo, "$newLayoutInfo");
                    this$0.f21208b.accept(newLayoutInfo);
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public void P(androidx.lifecycle.n nVar) {
        v0 v0Var = (v0) this.f27326e;
        if (v0Var != null) {
            v0Var.run();
        }
        v0 v0Var2 = new v0((w) this.f27324c, nVar);
        this.f27326e = v0Var2;
        ((Handler) this.f27325d).postAtFrontOfQueue(v0Var2);
    }

    public void Q() {
        ((TypedArray) this.f27325d).recycle();
    }

    public void R(y8.j jVar, int i, boolean z5) {
        e9.a aVar = (e9.a) this.f27326e;
        Context context = (Context) this.f27324c;
        ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        String str = jVar.f36552a;
        String str2 = jVar.f36552a;
        adler32.update(str.getBytes(Charset.forName("UTF-8")));
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        v8.d dVar = jVar.f36554c;
        adler32.update(byteBufferAllocate.putInt(i9.a.a(dVar)).array());
        byte[] bArr = jVar.f36553b;
        if (bArr != null) {
            adler32.update(bArr);
        }
        int value = (int) adler32.getValue();
        if (!z5) {
            Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                JobInfo next = it.next();
                int i10 = next.getExtras().getInt("attemptNumber");
                if (next.getId() == value) {
                    if (i10 >= i) {
                        ya.e.f("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", jVar);
                        return;
                    }
                }
            }
        }
        Cursor cursorRawQuery = ((f9.j) ((f9.d) this.f27325d)).a().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str2, String.valueOf(i9.a.a(dVar))});
        try {
            Cursor cursor = cursorRawQuery;
            Long lValueOf = cursor.moveToNext() ? Long.valueOf(cursor.getLong(0)) : 0L;
            cursorRawQuery.close();
            long jLongValue = lValueOf.longValue();
            JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
            builder.setMinimumLatency(aVar.a(dVar, jLongValue, i));
            Set set = ((e9.b) aVar.f16296b.get(dVar)).f16299c;
            if (set.contains(e9.c.f16300b)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (set.contains(e9.c.f16302d)) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(e9.c.f16301c)) {
                builder.setRequiresDeviceIdle(true);
            }
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i);
            persistableBundle.putString("backendName", str2);
            persistableBundle.putInt("priority", i9.a.a(dVar));
            if (bArr != null) {
                persistableBundle.putString("extras", Base64.encodeToString(bArr, 0));
            }
            builder.setExtras(persistableBundle);
            Object[] objArr = {jVar, Integer.valueOf(value), Long.valueOf(aVar.a(dVar, jLongValue, i)), lValueOf, Integer.valueOf(i)};
            String strM = ya.e.m("JobInfoScheduler");
            if (Log.isLoggable(strM, 3)) {
                Log.d(strM, String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr));
            }
            jobScheduler.schedule(builder.build());
        } catch (Throwable th2) {
            cursorRawQuery.close();
            throw th2;
        }
    }

    public void S(ti.j jVar, int i) {
        HashMap map = (HashMap) this.f27325d;
        if (map.get(Integer.valueOf(i)) != null) {
            throw new IllegalArgumentException(String.format("Ad for following adId already exists: %d", Integer.valueOf(i)));
        }
        map.put(Integer.valueOf(i), jVar);
    }

    public synchronized void U() {
        b bVar = (b) this.f27324c;
        ReentrantLock reentrantLock = bVar.f27302a;
        reentrantLock.lock();
        try {
            bVar.f27303b.edit().clear().apply();
            reentrantLock.unlock();
            this.f27325d = null;
            this.f27326e = null;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    @Override // ii.d
    public void a(ByteBuffer byteBuffer, zh.f fVar) throws Throwable {
        AtomicReference atomicReference = (AtomicReference) this.f27325d;
        ii.h hVar = (ii.h) this.f27324c;
        ii.i iVar = (ii.i) this.f27326e;
        String str = iVar.f21309b;
        ii.r rVar = iVar.f21310c;
        ii.n nVarA = rVar.a(byteBuffer);
        String str2 = nVarA.f21315a;
        Object obj = nVarA.f21316b;
        if (!str2.equals("listen")) {
            if (!str2.equals("cancel")) {
                fVar.a(null);
                return;
            }
            if (((ii.g) atomicReference.getAndSet(null)) == null) {
                fVar.a(rVar.d("error", "No active stream to cancel", null));
                return;
            }
            try {
                hVar.k(obj);
                fVar.a(rVar.b(null));
                return;
            } catch (RuntimeException e3) {
                Log.e("EventChannel#" + str, "Failed to close event stream", e3);
                fVar.a(rVar.d("error", e3.getMessage(), null));
                return;
            }
        }
        ii.g gVar = new ii.g(this);
        if (((ii.g) atomicReference.getAndSet(gVar)) != null) {
            try {
                hVar.k(null);
            } catch (RuntimeException e7) {
                Log.e("EventChannel#" + str, "Failed to close existing event stream", e7);
            }
        }
        try {
            hVar.e(obj, gVar);
            fVar.a(rVar.b(null));
        } catch (RuntimeException e10) {
            atomicReference.set(null);
            Log.e("EventChannel#" + str, "Failed to open event stream", e10);
            fVar.a(rVar.d("error", e10.getMessage(), null));
        }
    }

    @Override // oa.m
    public void accept(Object obj, Object obj2) {
        Account account = (Account) this.f27324c;
        String str = (String) this.f27325d;
        Bundle bundle = (Bundle) this.f27326e;
        h2 h2Var = (h2) ((g2) obj).n();
        i2 i2Var = new i2((sb.g) obj2);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(h2Var.f2257d);
        int i = com.google.android.gms.internal.auth.d.f13188a;
        parcelObtain.writeStrongBinder(i2Var);
        com.google.android.gms.internal.auth.d.b(parcelObtain, account);
        parcelObtain.writeString(str);
        com.google.android.gms.internal.auth.d.b(parcelObtain, bundle);
        h2Var.T0(parcelObtain, 1);
    }

    @Override // aj.g
    public Boolean b(String key, aj.h options) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(options, "options");
        SharedPreferences sharedPreferencesB = B(options);
        if (sharedPreferencesB.contains(key)) {
            return Boolean.valueOf(sharedPreferencesB.getBoolean(key, true));
        }
        return null;
    }

    @Override // aj.g
    public String c(String key, aj.h options) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(options, "options");
        SharedPreferences sharedPreferencesB = B(options);
        if (sharedPreferencesB.contains(key)) {
            return sharedPreferencesB.getString(key, "");
        }
        return null;
    }

    @Override // p3.g
    public p3.h createDataSource() {
        l6.i iVar = (l6.i) this.f27326e;
        p3.h hVarCreateDataSource = iVar != null ? iVar.createDataSource() : null;
        q3.b bVar = (q3.b) this.f27324c;
        bVar.getClass();
        return new q3.e(bVar, hVarCreateDataSource, ((q) this.f27325d).createDataSource(), hVarCreateDataSource != null ? new q3.d(bVar) : null);
    }

    @Override // aj.g
    public void d(String key, String value, aj.h options) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(options, "options");
        B(options).edit().putString(key, value).apply();
    }

    @Override // aj.g
    public void e(String key, double d10, aj.h options) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(options, "options");
        B(options).edit().putString(key, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d10).apply();
    }

    @Override // i2.h
    public Uri f() {
        return (Uri) this.f27324c;
    }

    @Override // aj.g
    public void g(String key, String value, aj.h options) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(options, "options");
        B(options).edit().putString(key, value).apply();
    }

    @Override // f2.f
    public Object get() {
        x0.a aVar = (x0.a) this.f27324c;
        int iY = hl.d.y(aVar);
        int iZ = hl.d.z(aVar);
        int i = aVar.f35505e;
        g0.h hVar = (g0.h) this.f27325d;
        int i10 = hVar.f19575e;
        if (i == -1) {
            com.google.android.gms.internal.auth.g.e("AudioSrcAdPrflRslvr", "Resolved AUDIO channel count from AudioProfile: " + i10);
            i = i10;
        } else {
            com.google.android.gms.internal.auth.g.e("AudioSrcAdPrflRslvr", om1.j("Media spec AUDIO channel count overrides AudioProfile [AudioProfile channel count: ", i10, ", Resolved Channel Count: ", i, "]"));
        }
        Range range = aVar.f35504d;
        int i11 = hVar.f19574d;
        d1.d dVarA = hl.d.A(range, i11, i, iZ, (Rational) this.f27326e);
        int i12 = dVarA.f15516b;
        int i13 = dVarA.f15515a;
        StringBuilder sbI = z.i("Using resolved AUDIO sample rate or nearest supported from AudioProfile: Capture sample rate: ", i13, "Hz. Encode sample rate: ", i12, "Hz. [AudioProfile sample rate: ");
        sbI.append(i11);
        sbI.append("Hz]");
        com.google.android.gms.internal.auth.g.e("AudioSrcAdPrflRslvr", sbI.toString());
        List list = a1.n.f367f;
        a1.m mVar = new a1.m();
        mVar.f362b = -1;
        mVar.f363c = -1;
        mVar.f364d = -1;
        mVar.f365e = -1;
        mVar.f366f = -1;
        mVar.f362b = Integer.valueOf(iY);
        mVar.f366f = Integer.valueOf(iZ);
        mVar.f365e = Integer.valueOf(i);
        mVar.f363c = Integer.valueOf(i13);
        mVar.f364d = Integer.valueOf(i12);
        return mVar.a();
    }

    @Override // i2.h
    public ClipDescription getDescription() {
        return (ClipDescription) this.f27325d;
    }

    @Override // i2.h
    public Uri i() {
        return (Uri) this.f27326e;
    }

    @Override // com.google.android.gms.internal.consent_sdk.i7
    public Object j() {
        Application application = (Application) ((d6) this.f27325d).f13360c;
        e0 e0Var = f0.f13386b;
        h0.c(e0Var);
        return new a0(application, e0Var, (com.google.android.gms.internal.consent_sdk.z) ((g7) this.f27326e).j(), false);
    }

    @Override // g0.b1
    public boolean k(int i) {
        return ((b1) this.f27324c).k(i) && H(i) != null;
    }

    @Override // aj.g
    public i0 l(String key, aj.h options) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(options, "options");
        SharedPreferences sharedPreferencesB = B(options);
        if (!sharedPreferencesB.contains(key)) {
            return null;
        }
        String string = sharedPreferencesB.getString(key, "");
        Intrinsics.b(string);
        return kotlin.text.a0.n(string, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!", false) ? new i0(string, g0.f962e) : kotlin.text.a0.n(string, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu", false) ? new i0(null, g0.f961d) : new i0(null, g0.f963f);
    }

    @Override // j1.i
    public Object m(j1.h hVar) {
        hVar.a(new ac.g(10, this), hl.d.j());
        ((j0.c) this.f27326e).f26125b.set(hVar);
        return "HandlerScheduledFuture-" + ((Callable) this.f27325d).toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006d  */
    @Override // ob.m2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void n(int r9, java.lang.Throwable r10, byte[] r11) {
        /*
            r8 = this;
            java.lang.Object r11 = r8.f27324c
            ob.k2 r11 = (ob.k2) r11
            r11.C()
            java.lang.Object r0 = r8.f27326e
            ob.r3 r0 = (ob.r3) r0
            r1 = 200(0xc8, float:2.8E-43)
            if (r9 == r1) goto L18
            r1 = 204(0xcc, float:2.86E-43)
            if (r9 == r1) goto L18
            r1 = 304(0x130, float:4.26E-43)
            if (r9 != r1) goto L33
            r9 = r1
        L18:
            if (r10 != 0) goto L33
            java.lang.Object r9 = r11.f15951b
            ob.l1 r9 = (ob.l1) r9
            ob.s0 r9 = r9.f30265g
            ob.l1.k(r9)
            com.google.android.gms.internal.ads.ur r9 = r9.f30418o
            long r1 = r0.f30391b
            java.lang.Long r10 = java.lang.Long.valueOf(r1)
            java.lang.String r1 = "[sgtm] Upload succeeded for row_id"
            r9.g(r10, r1)
            ob.p2 r9 = ob.p2.SUCCESS
            goto L6f
        L33:
            java.lang.Object r1 = r11.f15951b
            ob.l1 r1 = (ob.l1) r1
            ob.s0 r1 = r1.f30265g
            ob.l1.k(r1)
            com.google.android.gms.internal.ads.ur r1 = r1.f30413j
            long r2 = r0.f30391b
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r9)
            java.lang.String r4 = "[sgtm] Upload failed for row_id. response, exception"
            r1.i(r4, r2, r3, r10)
            ob.c0 r10 = ob.d0.f30044u
            r1 = 0
            java.lang.Object r10 = r10.a(r1)
            java.lang.String r10 = (java.lang.String) r10
            java.lang.String r1 = ","
            java.lang.String[] r10 = r10.split(r1)
            java.util.List r10 = java.util.Arrays.asList(r10)
            java.lang.String r9 = java.lang.String.valueOf(r9)
            boolean r9 = r10.contains(r9)
            if (r9 == 0) goto L6d
            ob.p2 r9 = ob.p2.BACKOFF
            goto L6f
        L6d:
            ob.p2 r9 = ob.p2.FAILURE
        L6f:
            java.lang.Object r10 = r8.f27325d
            java.util.concurrent.atomic.AtomicReference r10 = (java.util.concurrent.atomic.AtomicReference) r10
            java.lang.Object r1 = r11.f15951b
            ob.l1 r1 = (ob.l1) r1
            ob.d3 r1 = r1.n()
            ob.d r2 = new ob.d
            long r4 = r0.f30391b
            int r3 = r9.f30349b
            long r6 = r0.f30396g
            r2.<init>(r3, r4, r6)
            r1.C()
            r1.D()
            r0 = 1
            ob.g4 r0 = r1.S(r0)
            aa.y r3 = new aa.y
            r6 = 24
            r3.<init>(r1, r0, r2, r6)
            r1.Q(r3)
            java.lang.Object r11 = r11.f15951b
            ob.l1 r11 = (ob.l1) r11
            ob.s0 r11 = r11.f30265g
            ob.l1.k(r11)
            com.google.android.gms.internal.ads.ur r11 = r11.f30418o
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            java.lang.String r1 = "[sgtm] Updated status for row_id"
            r11.h(r0, r1, r9)
            monitor-enter(r10)
            r10.set(r9)     // Catch: java.lang.Throwable -> Lb8
            r10.notifyAll()     // Catch: java.lang.Throwable -> Lb8
            monitor-exit(r10)     // Catch: java.lang.Throwable -> Lb8
            return
        Lb8:
            r0 = move-exception
            r9 = r0
            monitor-exit(r10)     // Catch: java.lang.Throwable -> Lb8
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ka.k.n(int, java.lang.Throwable, byte[]):void");
    }

    @Override // aj.g
    public Map o(List list, aj.h options) {
        Object value;
        Intrinsics.checkNotNullParameter(options, "options");
        Map<String, ?> all = B(options).getAll();
        Intrinsics.checkNotNullExpressionValue(all, "getAll(...)");
        HashMap map = new HashMap();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            if (aj.f0.b(entry.getKey(), entry.getValue(), list != null ? CollectionsKt.V(list) : null) && (value = entry.getValue()) != null) {
                String key = entry.getKey();
                Object objC = aj.f0.c(value, (nc.e) this.f27326e);
                Intrinsics.c(objC, "null cannot be cast to non-null type kotlin.Any");
                map.put(key, objC);
            }
        }
        return map;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        la.b bVar = (la.b) this.f27324c;
        String str = (String) this.f27325d;
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.f27326e;
        synchronized (bVar.f28063a) {
            bVar.f28063a.remove(str);
        }
        scheduledFuture.cancel(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x016d  */
    @Override // ii.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMethodCall(ii.n r12, ii.p r13) {
        /*
            Method dump skipped, instruction units count: 635
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ka.k.onMethodCall(ii.n, ii.p):void");
    }

    @Override // aj.g
    public void p(String key, List value, aj.h options) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(options, "options");
        B(options).edit().putString(key, om1.k("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu", ((nc.e) this.f27326e).g(value))).apply();
    }

    @Override // aj.g
    public ArrayList q(String key, aj.h options) {
        List list;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(options, "options");
        SharedPreferences sharedPreferencesB = B(options);
        if (!sharedPreferencesB.contains(key)) {
            return null;
        }
        String string = sharedPreferencesB.getString(key, "");
        Intrinsics.b(string);
        if (!kotlin.text.a0.n(string, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu", false) || kotlin.text.a0.n(string, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!", false) || (list = (List) aj.f0.c(sharedPreferencesB.getString(key, ""), (nc.e) this.f27326e)) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof String) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002c A[Catch: all -> 0x001e, TryCatch #0 {all -> 0x001e, blocks: (B:4:0x001b, B:19:0x0065, B:22:0x0089, B:13:0x002c, B:15:0x0052, B:17:0x005d, B:18:0x0061), top: B:27:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0061 A[Catch: all -> 0x001e, TryCatch #0 {all -> 0x001e, blocks: (B:4:0x001b, B:19:0x0065, B:22:0x0089, B:13:0x002c, B:15:0x0052, B:17:0x005d, B:18:0x0061), top: B:27:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0088  */
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
    @Override // ob.t0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void r(java.lang.String r6, int r7, java.lang.Throwable r8, byte[] r9, java.util.Map r10) {
        /*
            r5 = this;
            java.lang.Object r6 = r5.f27325d
            ob.a4 r6 = (ob.a4) r6
            long r0 = r6.f29937a
            java.lang.Object r6 = r5.f27326e
            ob.z3 r6 = (ob.z3) r6
            java.lang.Object r10 = r5.f27324c
            java.lang.String r10 = (java.lang.String) r10
            ob.i1 r2 = r6.e()
            r2.C()
            r6.k0()
            r2 = 0
            if (r9 != 0) goto L21
            byte[] r9 = new byte[r2]     // Catch: java.lang.Throwable -> L1e
            goto L21
        L1e:
            r7 = move-exception
            goto La1
        L21:
            r3 = 200(0xc8, float:2.8E-43)
            if (r7 == r3) goto L2a
            r3 = 204(0xcc, float:2.86E-43)
            if (r7 != r3) goto L65
            r7 = r3
        L2a:
            if (r8 != 0) goto L65
            ob.n r8 = r6.f30607d     // Catch: java.lang.Throwable -> L1e
            ob.z3.T(r8)     // Catch: java.lang.Throwable -> L1e
            java.lang.Long r9 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> L1e
            r8.J(r9)     // Catch: java.lang.Throwable -> L1e
            ob.s0 r8 = r6.b()     // Catch: java.lang.Throwable -> L1e
            com.google.android.gms.internal.ads.ur r8 = r8.f30418o     // Catch: java.lang.Throwable -> L1e
            java.lang.String r9 = "Successfully uploaded batch from upload queue. appId, status"
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L1e
            r8.h(r10, r9, r7)     // Catch: java.lang.Throwable -> L1e
            ob.v0 r7 = r6.f30606c     // Catch: java.lang.Throwable -> L1e
            ob.z3.T(r7)     // Catch: java.lang.Throwable -> L1e
            boolean r7 = r7.W()     // Catch: java.lang.Throwable -> L1e
            if (r7 == 0) goto L61
            ob.n r7 = r6.f30607d     // Catch: java.lang.Throwable -> L1e
            ob.z3.T(r7)     // Catch: java.lang.Throwable -> L1e
            boolean r7 = r7.I(r10)     // Catch: java.lang.Throwable -> L1e
            if (r7 == 0) goto L61
            r6.t(r10)     // Catch: java.lang.Throwable -> L1e
            goto L9b
        L61:
            r6.N()     // Catch: java.lang.Throwable -> L1e
            goto L9b
        L65:
            java.lang.String r3 = new java.lang.String     // Catch: java.lang.Throwable -> L1e
            java.nio.charset.Charset r4 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L1e
            r3.<init>(r9, r4)     // Catch: java.lang.Throwable -> L1e
            int r9 = r3.length()     // Catch: java.lang.Throwable -> L1e
            r4 = 32
            int r9 = java.lang.Math.min(r4, r9)     // Catch: java.lang.Throwable -> L1e
            java.lang.String r9 = r3.substring(r2, r9)     // Catch: java.lang.Throwable -> L1e
            ob.s0 r3 = r6.b()     // Catch: java.lang.Throwable -> L1e
            com.google.android.gms.internal.ads.ur r3 = r3.f30415l     // Catch: java.lang.Throwable -> L1e
            java.lang.String r4 = "Network upload failed. Will retry later. appId, status, error"
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L1e
            if (r8 != 0) goto L89
            r8 = r9
        L89:
            r3.i(r4, r10, r7, r8)     // Catch: java.lang.Throwable -> L1e
            ob.n r7 = r6.f30607d     // Catch: java.lang.Throwable -> L1e
            ob.z3.T(r7)     // Catch: java.lang.Throwable -> L1e
            java.lang.Long r8 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> L1e
            r7.O(r8)     // Catch: java.lang.Throwable -> L1e
            r6.N()     // Catch: java.lang.Throwable -> L1e
        L9b:
            r6.f30624v = r2
            r6.O()
            return
        La1:
            r6.f30624v = r2
            r6.O()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ka.k.r(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
    }

    @Override // aj.g
    public void s(String key, boolean z5, aj.h options) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(options, "options");
        B(options).edit().putBoolean(key, z5).apply();
    }

    @Override // aj.g
    public Long t(String key, aj.h options) {
        long j10;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(options, "options");
        SharedPreferences sharedPreferencesB = B(options);
        if (!sharedPreferencesB.contains(key)) {
            return null;
        }
        try {
            j10 = sharedPreferencesB.getLong(key, 0L);
        } catch (ClassCastException unused) {
            j10 = sharedPreferencesB.getInt(key, 0);
        }
        return Long.valueOf(j10);
    }

    public String toString() {
        switch (this.f27323b) {
            case 7:
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append((String) this.f27324c);
                sb2.append('{');
                com.google.android.gms.internal.play_billing.i iVar = ((com.google.android.gms.internal.play_billing.i) this.f27325d).f14213b;
                String str = "";
                while (iVar != null) {
                    Object obj = iVar.f14212a;
                    sb2.append(str);
                    if (obj == null || !obj.getClass().isArray()) {
                        sb2.append(obj);
                    } else {
                        sb2.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r2.length() - 1);
                    }
                    iVar = iVar.f14213b;
                    str = ", ";
                }
                sb2.append('}');
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    @Override // g0.b1
    public c1 u(int i) {
        return H(i);
    }

    @Override // aj.g
    public List v(List list, aj.h options) {
        Intrinsics.checkNotNullParameter(options, "options");
        Map<String, ?> all = B(options).getAll();
        Intrinsics.checkNotNullExpressionValue(all, "getAll(...)");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            Intrinsics.checkNotNullExpressionValue(key, "<get-key>(...)");
            if (aj.f0.b(key, entry.getValue(), list != null ? CollectionsKt.V(list) : null)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return CollectionsKt.R(linkedHashMap.keySet());
    }

    @Override // i2.h
    public Object w() {
        return null;
    }

    @Override // aj.g
    public Double x(String key, aj.h options) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(options, "options");
        SharedPreferences sharedPreferencesB = B(options);
        if (!sharedPreferencesB.contains(key)) {
            return null;
        }
        Object objC = aj.f0.c(sharedPreferencesB.getString(key, ""), (nc.e) this.f27326e);
        Intrinsics.c(objC, "null cannot be cast to non-null type kotlin.Double");
        return (Double) objC;
    }

    @Override // aj.g
    public void y(String key, long j10, aj.h options) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(options, "options");
        B(options).edit().putLong(key, j10).apply();
    }

    @Override // aj.g
    public void z(List list, aj.h options) {
        Intrinsics.checkNotNullParameter(options, "options");
        SharedPreferences sharedPreferencesB = B(options);
        SharedPreferences.Editor editorEdit = sharedPreferencesB.edit();
        Intrinsics.checkNotNullExpressionValue(editorEdit, "edit(...)");
        Map<String, ?> all = sharedPreferencesB.getAll();
        Intrinsics.checkNotNullExpressionValue(all, "getAll(...)");
        ArrayList arrayList = new ArrayList();
        for (String str : all.keySet()) {
            if (aj.f0.b(str, all.get(str), list != null ? CollectionsKt.V(list) : null)) {
                arrayList.add(str);
            }
        }
        Iterator it = arrayList.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "next(...)");
            editorEdit.remove((String) next);
        }
        editorEdit.apply();
    }

    public /* synthetic */ k(int i, Object obj, Object obj2, Object obj3, boolean z5) {
        this.f27323b = i;
        this.f27326e = obj;
        this.f27324c = obj2;
        this.f27325d = obj3;
    }

    public /* synthetic */ k(com.google.android.gms.internal.auth.a aVar, Account account, String str, Bundle bundle) {
        this.f27323b = 5;
        this.f27324c = account;
        this.f27325d = str;
        this.f27326e = bundle;
    }

    public /* synthetic */ k(Object obj, Object obj2, Object obj3, int i) {
        this.f27323b = i;
        this.f27324c = obj;
        this.f27325d = obj2;
        this.f27326e = obj3;
    }

    public k(Context context) {
        String strE;
        this.f27323b = 0;
        b bVarA = b.a(context);
        this.f27324c = bVarA;
        this.f27325d = bVarA.b();
        String strE2 = bVarA.e("defaultGoogleSignInAccount");
        GoogleSignInOptions googleSignInOptionsA = null;
        if (!TextUtils.isEmpty(strE2) && (strE = bVarA.e(b.f("googleSignInOptions", strE2))) != null) {
            try {
                googleSignInOptionsA = GoogleSignInOptions.a(strE);
            } catch (JSONException unused) {
            }
        }
        this.f27326e = googleSignInOptionsA;
    }

    public k(Context context, u9.a aVar) {
        this.f27323b = 4;
        this.f27324c = context;
        this.f27325d = context.getPackageName();
        this.f27326e = aVar.f34365b;
    }

    public k(String str) {
        this.f27323b = 7;
        com.google.android.gms.internal.play_billing.i iVar = new com.google.android.gms.internal.play_billing.i();
        this.f27325d = iVar;
        this.f27326e = iVar;
        this.f27324c = str;
    }

    public k(PackageManager packageManager, ActivityManager activityManager, ContentResolver contentResolver) {
        this.f27323b = 22;
        Intrinsics.checkNotNullParameter(packageManager, "packageManager");
        Intrinsics.checkNotNullParameter(activityManager, "activityManager");
        Intrinsics.checkNotNullParameter(contentResolver, "contentResolver");
        this.f27324c = packageManager;
        this.f27325d = activityManager;
        this.f27326e = contentResolver;
    }

    public k(x provider) {
        this.f27323b = 3;
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.f27324c = new w(provider);
        this.f27325d = new Handler(Looper.getMainLooper());
    }

    @Override // i2.h
    public void h() {
    }

    public k(ii.q qVar) {
        this.f27323b = 28;
        this.f27326e = qVar;
        this.f27325d = new HashMap();
    }

    public k(b1 b1Var, a2 a2Var) {
        this.f27323b = 10;
        this.f27326e = new HashMap();
        this.f27324c = b1Var;
        this.f27325d = a2Var;
    }

    public k(Context context, TypedArray typedArray) {
        this.f27323b = 18;
        this.f27324c = context;
        this.f27325d = typedArray;
    }

    public k(zh.b bVar, FlutterJNI flutterJNI) {
        this.f27323b = 11;
        fe.c cVar = new fe.c(16, this);
        s7.g gVar = new s7.g(bVar, "flutter/accessibility", ii.w.INSTANCE, (Object) null);
        this.f27324c = gVar;
        gVar.L(cVar);
        this.f27325d = flutterJNI;
    }

    public k(Class cls) {
        this.f27323b = 16;
        HashSet hashSet = new HashSet();
        this.f27326e = hashSet;
        this.f27324c = UUID.randomUUID();
        this.f27325d = new u7.j(((UUID) this.f27324c).toString(), cls.getName());
        hashSet.add(cls.getName());
        ((u7.j) this.f27325d).f34333d = OverwritingInputMerger.class.getName();
    }

    public k(ii.i iVar, ii.h hVar) {
        this.f27323b = 14;
        this.f27326e = iVar;
        this.f27325d = new AtomicReference(null);
        this.f27324c = hVar;
    }

    public k(ii.f messenger, Context context, nc.e listEncoder) {
        this.f27323b = 2;
        Intrinsics.checkNotNullParameter(messenger, "messenger");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(listEncoder, "listEncoder");
        this.f27324c = messenger;
        this.f27325d = context;
        this.f27326e = listEncoder;
        try {
            aj.g.f959s1.getClass();
            aj.f.b(messenger, this, "shared_preferences");
        } catch (Exception e3) {
            Log.e("SharedPreferencesPlugin", "Received exception while setting up SharedPreferencesBackend", e3);
        }
    }

    public k(io.flutter.plugins.firebase.messaging.a aVar) {
        this.f27323b = 25;
        this.f27326e = aVar;
        this.f27324c = Executors.newSingleThreadExecutor();
        this.f27325d = new Handler(Looper.getMainLooper());
    }

    public k(j0.i iVar) {
        this.f27323b = 27;
        this.f27325d = new AtomicBoolean(true);
        this.f27326e = iVar;
    }

    public k(a0.b1 callbackInterface) {
        this.f27323b = 13;
        Intrinsics.checkNotNullParameter(callbackInterface, "callbackInterface");
        this.f27324c = callbackInterface;
        this.f27325d = new ReentrantLock();
        this.f27326e = new WeakHashMap();
    }

    public k(u3.r rVar) {
        this.f27323b = 29;
        this.f27326e = rVar;
        Handler handlerO = m3.z.o(null);
        this.f27324c = handlerO;
        dw1 dw1Var = new dw1(1, this);
        this.f27325d = dw1Var;
        rVar.f34156a.registerStreamEventCallback(new s3.x(1, handlerO), dw1Var);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, s3.w] */
    public k(y yVar, Context context) {
        this.f27323b = 26;
        this.f27326e = yVar;
        this.f27324c = new WeakReference(context);
        ?? r02 = new IntConsumer() { // from class: s3.w
            @Override // java.util.function.IntConsumer
            public final void accept(int i) {
                y yVar2 = (y) this.f32678a.f27326e;
                if (yVar2.f32698g0) {
                    return;
                }
                yVar2.b0(1, 19, Integer.valueOf(i));
            }
        };
        this.f27325d = r02;
        context.registerDeviceIdChangeListener(new s3.x(0, yVar.f32717w.a(yVar.f32715u, null)), r02);
    }
}
