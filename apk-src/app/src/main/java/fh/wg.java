package fh;

import com.yandex.div.json.JsonTemplate;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class wg implements JsonTemplate {
    public final Object a() {
        if (this instanceof ug) {
            return ((ug) this).f18698a;
        }
        if (this instanceof tg) {
            return ((tg) this).f18647a;
        }
        if (this instanceof vg) {
            return ((vg) this).f18776a;
        }
        throw new ij.j();
    }
}
