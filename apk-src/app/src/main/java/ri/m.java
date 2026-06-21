package ri;

import android.content.ComponentName;
import android.content.Intent;
import l7.o;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ComponentName f32360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f32361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f32362c;

    public m(ComponentName componentName) {
        this.f32360a = componentName;
    }

    public abstract void a(Intent intent);

    public final void b(int i) {
        if (!this.f32361b) {
            this.f32361b = true;
            this.f32362c = i;
        } else {
            if (this.f32362c == i) {
                return;
            }
            StringBuilder sbM = o.m(i, "Given job ID ", " is different than previous ");
            sbM.append(this.f32362c);
            throw new IllegalArgumentException(sbM.toString());
        }
    }

    public void c() {
    }

    public void d() {
    }

    public void e() {
    }
}
