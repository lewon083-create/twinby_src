package fh;

import com.yandex.div.json.JsonTemplate;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class qo implements JsonTemplate {
    public final Object a() {
        if (this instanceof no) {
            return ((no) this).f18001a;
        }
        if (this instanceof oo) {
            return ((oo) this).f18043a;
        }
        if (this instanceof po) {
            return ((po) this).f18106a;
        }
        throw new ij.j();
    }
}
