package pa;

import android.content.ComponentName;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f31400b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ComponentName f31401c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f31402d;

    public m0(ComponentName componentName) {
        this.f31399a = null;
        this.f31400b = null;
        c0.i(componentName);
        this.f31401c = componentName;
        this.f31402d = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return c0.m(this.f31399a, m0Var.f31399a) && c0.m(this.f31400b, m0Var.f31400b) && c0.m(this.f31401c, m0Var.f31401c) && this.f31402d == m0Var.f31402d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f31399a, this.f31400b, this.f31401c, 4225, Boolean.valueOf(this.f31402d)});
    }

    public final String toString() {
        String str = this.f31399a;
        if (str != null) {
            return str;
        }
        ComponentName componentName = this.f31401c;
        c0.i(componentName);
        return componentName.flattenToString();
    }

    public m0(String str, boolean z5) {
        c0.f(str);
        this.f31399a = str;
        c0.f("com.google.android.gms");
        this.f31400b = "com.google.android.gms";
        this.f31401c = null;
        this.f31402d = z5;
    }
}
