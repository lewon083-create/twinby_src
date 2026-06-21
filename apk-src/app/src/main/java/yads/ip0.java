package yads;

import android.util.LruCache;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ip0 extends LruCache {
    public ip0(int i) {
        super(i);
    }

    @Override // android.util.LruCache
    public final void entryRemoved(boolean z5, Object obj, Object obj2, Object obj3) {
        r52 r52Var = (r52) obj2;
        if (r52Var != null) {
            r52Var.a();
        }
    }
}
