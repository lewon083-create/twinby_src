package rb;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.PowerManager;
import android.os.SystemClock;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.ads.oc;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import ob.h4;
import pa.c0;
import ua.c;
import ua.d;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final long f32276n = TimeUnit.DAYS.toMillis(366);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static volatile ScheduledExecutorService f32277o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Object f32278p = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f32279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PowerManager.WakeLock f32280b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f32281c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ScheduledFuture f32282d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f32283e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashSet f32284f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f32285g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public hb.a f32286h;
    public final ua.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f32287j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final HashMap f32288k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AtomicInteger f32289l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ScheduledExecutorService f32290m;

    public a(Context context) {
        boolean zBooleanValue;
        String packageName = context.getPackageName();
        this.f32279a = new Object();
        this.f32281c = 0;
        this.f32284f = new HashSet();
        this.f32285g = true;
        this.i = ua.a.f34401a;
        this.f32288k = new HashMap();
        this.f32289l = new AtomicInteger(0);
        c0.g("wake:com.google.firebase.iid.WakeLockHolder", "WakeLock: wakeLockName must not be empty");
        context.getApplicationContext();
        WorkSource workSource = null;
        this.f32286h = null;
        if ("com.google.android.gms".equals(context.getPackageName())) {
            this.f32287j = "wake:com.google.firebase.iid.WakeLockHolder";
        } else {
            this.f32287j = "wake:com.google.firebase.iid.WakeLockHolder".length() != 0 ? "*gcore*:".concat("wake:com.google.firebase.iid.WakeLockHolder") : new String("*gcore*:");
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            StringBuilder sb2 = new StringBuilder(29);
            sb2.append((CharSequence) "expected a non-null reference", 0, 29);
            throw new oc(sb2.toString());
        }
        this.f32280b = powerManager.newWakeLock(1, "wake:com.google.firebase.iid.WakeLockHolder");
        Method method = d.f34412a;
        synchronized (d.class) {
            Boolean bool = d.f34416e;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = t1.b.a(context, "android.permission.UPDATE_DEVICE_STATS") == 0;
                d.f34416e = Boolean.valueOf(zBooleanValue);
            }
        }
        if (zBooleanValue) {
            packageName = c.a(packageName) ? context.getPackageName() : packageName;
            if (context.getPackageManager() != null && packageName != null) {
                try {
                    ApplicationInfo applicationInfoC = wa.b.a(context).c(0, packageName);
                    if (applicationInfoC == null) {
                        Log.e("WorkSourceUtil", "Could not get applicationInfo from package: ".concat(packageName));
                    } else {
                        int i = applicationInfoC.uid;
                        workSource = new WorkSource();
                        d.a(workSource, i, packageName);
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    Log.e("WorkSourceUtil", "Could not find package: ".concat(packageName));
                }
            }
            if (workSource != null) {
                try {
                    this.f32280b.setWorkSource(workSource);
                } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e3) {
                    Log.wtf("WakeLock", e3.toString());
                }
            }
        }
        ScheduledExecutorService scheduledExecutorServiceUnconfigurableScheduledExecutorService = f32277o;
        if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
            synchronized (f32278p) {
                try {
                    scheduledExecutorServiceUnconfigurableScheduledExecutorService = f32277o;
                    if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
                        scheduledExecutorServiceUnconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                        f32277o = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
                    }
                } finally {
                }
            }
        }
        this.f32290m = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
    }

    public final void a(long j10) {
        this.f32289l.incrementAndGet();
        long jMax = Math.max(Math.min(Long.MAX_VALUE, f32276n), 1L);
        if (j10 > 0) {
            jMax = Math.min(j10, jMax);
        }
        synchronized (this.f32279a) {
            try {
                if (!b()) {
                    this.f32286h = hb.a.f20473b;
                    this.f32280b.acquire();
                    this.i.getClass();
                    SystemClock.elapsedRealtime();
                }
                this.f32281c++;
                if (this.f32285g) {
                    TextUtils.isEmpty(null);
                }
                b bVar = (b) this.f32288k.get(null);
                if (bVar == null) {
                    bVar = new b();
                    this.f32288k.put(null, bVar);
                }
                bVar.f32291a++;
                this.i.getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long j11 = Long.MAX_VALUE - jElapsedRealtime > jMax ? jElapsedRealtime + jMax : Long.MAX_VALUE;
                if (j11 > this.f32283e) {
                    this.f32283e = j11;
                    ScheduledFuture scheduledFuture = this.f32282d;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.f32282d = this.f32290m.schedule(new h4(6, this), jMax, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean b() {
        boolean z5;
        synchronized (this.f32279a) {
            z5 = this.f32281c > 0;
        }
        return z5;
    }

    public final void c() {
        if (this.f32289l.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.f32287j).concat(" release without a matched acquire!"));
        }
        synchronized (this.f32279a) {
            try {
                if (this.f32285g) {
                    TextUtils.isEmpty(null);
                }
                if (this.f32288k.containsKey(null)) {
                    b bVar = (b) this.f32288k.get(null);
                    if (bVar != null) {
                        int i = bVar.f32291a - 1;
                        bVar.f32291a = i;
                        if (i == 0) {
                            this.f32288k.remove(null);
                        }
                    }
                } else {
                    Log.w("WakeLock", String.valueOf(this.f32287j).concat(" counter does not exist"));
                }
                e();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d() {
        HashSet hashSet = this.f32284f;
        if (hashSet.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(hashSet);
        hashSet.clear();
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    public final void e() {
        synchronized (this.f32279a) {
            try {
                if (b()) {
                    if (this.f32285g) {
                        int i = this.f32281c - 1;
                        this.f32281c = i;
                        if (i > 0) {
                            return;
                        }
                    } else {
                        this.f32281c = 0;
                    }
                    d();
                    Iterator it = this.f32288k.values().iterator();
                    while (it.hasNext()) {
                        ((b) it.next()).f32291a = 0;
                    }
                    this.f32288k.clear();
                    ScheduledFuture scheduledFuture = this.f32282d;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                        this.f32282d = null;
                        this.f32283e = 0L;
                    }
                    if (this.f32280b.isHeld()) {
                        try {
                            try {
                                this.f32280b.release();
                                if (this.f32286h != null) {
                                    this.f32286h = null;
                                }
                            } catch (RuntimeException e3) {
                                if (!e3.getClass().equals(RuntimeException.class)) {
                                    throw e3;
                                }
                                Log.e("WakeLock", String.valueOf(this.f32287j).concat(" failed to release!"), e3);
                                if (this.f32286h != null) {
                                    this.f32286h = null;
                                }
                            }
                        } catch (Throwable th2) {
                            if (this.f32286h != null) {
                                this.f32286h = null;
                            }
                            throw th2;
                        }
                    } else {
                        Log.e("WakeLock", String.valueOf(this.f32287j).concat(" should be held!"));
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
