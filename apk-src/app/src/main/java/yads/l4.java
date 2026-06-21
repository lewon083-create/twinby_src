package yads;

import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class l4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f40418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f40419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f40420c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f40421d;

    public l4(int i, String str, String str2, String str3) {
        this.f40418a = i;
        this.f40419b = str;
        this.f40420c = str2;
        this.f40421d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l4)) {
            return false;
        }
        l4 l4Var = (l4) obj;
        return this.f40418a == l4Var.f40418a && Intrinsics.a(this.f40419b, l4Var.f40419b) && Intrinsics.a(this.f40420c, l4Var.f40420c) && Intrinsics.a(this.f40421d, l4Var.f40421d);
    }

    public final int hashCode() {
        int iA = k4.a(this.f40420c, k4.a(this.f40419b, Integer.hashCode(this.f40418a) * 31, 31), 31);
        String str = this.f40421d;
        return iA + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        String str = String.format(Locale.US, "AdFetchRequestError (code: %d, description: %s, adUnitId: %s, display_message: %s)", Arrays.copyOf(new Object[]{Integer.valueOf(this.f40418a), this.f40419b, this.f40421d, this.f40420c}, 4));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }
}
