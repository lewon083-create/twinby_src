package fh;

import com.yandex.div.json.JsonTemplate;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class jk implements JsonTemplate {
    public final Object a() {
        if (this instanceof ik) {
            return ((ik) this).f17393a;
        }
        if (this instanceof gk) {
            return ((gk) this).f17297a;
        }
        if (this instanceof hk) {
            return ((hk) this).f17340a;
        }
        throw new ij.j();
    }
}
