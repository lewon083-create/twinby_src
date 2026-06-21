package yads;

import android.os.Bundle;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class w01 extends sl2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final wq f44243e = new zl.g0(28);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f44244c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f44245d;

    public w01() {
        this.f44244c = false;
        this.f44245d = false;
    }

    public static w01 b(Bundle bundle) {
        if (bundle.getInt(Integer.toString(0, 36), -1) == 0) {
            return bundle.getBoolean(Integer.toString(1, 36), false) ? new w01(bundle.getBoolean(Integer.toString(2, 36), false)) : new w01();
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof w01)) {
            return false;
        }
        w01 w01Var = (w01) obj;
        return this.f44245d == w01Var.f44245d && this.f44244c == w01Var.f44244c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f44244c), Boolean.valueOf(this.f44245d)});
    }

    public w01(boolean z5) {
        this.f44244c = true;
        this.f44245d = z5;
    }
}
