package yads;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class lq1 {
    public static kh2 a(String str, Exception exc) {
        bh2 bh2Var = exc instanceof hk.v1 ? bh2.f37027d : exc instanceof IllegalArgumentException ? bh2.f37028e : exc instanceof NoSuchElementException ? bh2.f37029f : bh2.f37030g;
        return lh2.a(str, bh2Var.b(), Integer.valueOf(bh2Var.a()));
    }

    public static kh2 a(String str) {
        bh2 bh2Var = bh2.f37029f;
        return lh2.a(str, bh2Var.b(), Integer.valueOf(bh2Var.a()));
    }

    public static kh2 a() {
        bh2.f37029f.b();
        return lh2.a();
    }
}
