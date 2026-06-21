package a1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import t.z;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final List f367f = Collections.unmodifiableList(Arrays.asList(192000, 48000, 44100, 24000, 22050, 16000, 12000, 11025, 8000, 4800));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f369b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f370c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f371d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f372e;

    public n(int i, int i10, int i11, int i12, int i13) {
        this.f368a = i;
        this.f369b = i10;
        this.f370c = i11;
        this.f371d = i12;
        this.f372e = i13;
    }

    public final int a() {
        int i = this.f371d;
        f2.g.a("Invalid channel count: " + i, i > 0);
        int i10 = this.f372e;
        if (i10 == 2) {
            return i * 2;
        }
        if (i10 == 3) {
            return i;
        }
        if (i10 != 4) {
            if (i10 == 21) {
                return i * 3;
            }
            if (i10 != 22) {
                throw new IllegalArgumentException(l7.o.i(i10, "Invalid audio encoding: "));
            }
        }
        return i * 4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n) {
            n nVar = (n) obj;
            if (this.f368a == nVar.f368a && this.f369b == nVar.f369b && this.f370c == nVar.f370c && this.f371d == nVar.f371d && this.f372e == nVar.f372e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f368a ^ 1000003) * 1000003) ^ this.f369b) * 1000003) ^ this.f370c) * 1000003) ^ this.f371d) * 1000003) ^ this.f372e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AudioSettings{audioSource=");
        sb2.append(this.f368a);
        sb2.append(", captureSampleRate=");
        sb2.append(this.f369b);
        sb2.append(", encodeSampleRate=");
        sb2.append(this.f370c);
        sb2.append(", channelCount=");
        sb2.append(this.f371d);
        sb2.append(", audioFormat=");
        return z.d(this.f372e, "}", sb2);
    }
}
