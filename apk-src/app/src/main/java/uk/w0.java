package uk;

import com.google.android.gms.internal.measurement.h5;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class w0 implements sk.f, j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sk.f f34601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f34602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f34603c;

    public w0(sk.f original) {
        Intrinsics.checkNotNullParameter(original, "original");
        this.f34601a = original;
        this.f34602b = original.a() + '?';
        this.f34603c = o0.b(original);
    }

    @Override // sk.f
    public final String a() {
        return this.f34602b;
    }

    @Override // uk.j
    public final Set b() {
        return this.f34603c;
    }

    @Override // sk.f
    public final boolean c() {
        return true;
    }

    @Override // sk.f
    public final int d(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f34601a.d(name);
    }

    @Override // sk.f
    public final h5 e() {
        return this.f34601a.e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof w0) {
            return Intrinsics.a(this.f34601a, ((w0) obj).f34601a);
        }
        return false;
    }

    @Override // sk.f
    public final int f() {
        return this.f34601a.f();
    }

    @Override // sk.f
    public final String g(int i) {
        return this.f34601a.g(i);
    }

    @Override // sk.f
    public final List getAnnotations() {
        return this.f34601a.getAnnotations();
    }

    @Override // sk.f
    public final List h(int i) {
        return this.f34601a.h(i);
    }

    public final int hashCode() {
        return this.f34601a.hashCode() * 31;
    }

    @Override // sk.f
    public final sk.f i(int i) {
        return this.f34601a.i(i);
    }

    @Override // sk.f
    public final boolean isInline() {
        return this.f34601a.isInline();
    }

    @Override // sk.f
    public final boolean j(int i) {
        return this.f34601a.j(i);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f34601a);
        sb2.append('?');
        return sb2.toString();
    }
}
