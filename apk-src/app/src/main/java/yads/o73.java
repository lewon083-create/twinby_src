package yads;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class o73 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f41483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f41484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f41485c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f41486d;

    public o73(int i, int i10, int i11, byte[] bArr) {
        this.f41483a = i;
        this.f41484b = bArr;
        this.f41485c = i10;
        this.f41486d = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o73.class == obj.getClass()) {
            o73 o73Var = (o73) obj;
            if (this.f41483a == o73Var.f41483a && this.f41485c == o73Var.f41485c && this.f41486d == o73Var.f41486d && Arrays.equals(this.f41484b, o73Var.f41484b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f41484b) + (this.f41483a * 31)) * 31) + this.f41485c) * 31) + this.f41486d;
    }
}
