package ri;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class g extends m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f32345d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final PowerManager.WakeLock f32346e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final PowerManager.WakeLock f32347f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f32348g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f32349h;

    public g(Context context, ComponentName componentName) {
        super(componentName);
        this.f32345d = context.getApplicationContext();
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, componentName.getClassName() + ":launch");
        this.f32346e = wakeLockNewWakeLock;
        wakeLockNewWakeLock.setReferenceCounted(false);
        PowerManager.WakeLock wakeLockNewWakeLock2 = powerManager.newWakeLock(1, componentName.getClassName() + ":run");
        this.f32347f = wakeLockNewWakeLock2;
        wakeLockNewWakeLock2.setReferenceCounted(false);
    }

    @Override // ri.m
    public final void a(Intent intent) {
        Intent intent2 = new Intent(intent);
        intent2.setComponent(this.f32360a);
        if (this.f32345d.startService(intent2) != null) {
            synchronized (this) {
                try {
                    if (!this.f32348g) {
                        this.f32348g = true;
                        if (!this.f32349h) {
                            this.f32346e.acquire(60000L);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // ri.m
    public final void c() {
        synchronized (this) {
            try {
                if (this.f32349h) {
                    if (this.f32348g) {
                        this.f32346e.acquire(60000L);
                    }
                    this.f32349h = false;
                    this.f32347f.release();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // ri.m
    public final void d() {
        synchronized (this) {
            try {
                if (!this.f32349h) {
                    this.f32349h = true;
                    this.f32347f.acquire(600000L);
                    this.f32346e.release();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // ri.m
    public final void e() {
        synchronized (this) {
            this.f32348g = false;
        }
    }
}
