package yads;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.mobile.ads.R$dimen;
import com.yandex.mobile.ads.R$id;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class a80 extends k6.s0 {
    @Override // k6.s0
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, k6.f1 f1Var) {
        super.getItemOffsets(rect, view, recyclerView, f1Var);
        Resources resources = view.getResources();
        if (view.getId() == R$id.item_divider) {
            if (recyclerView.getChildAdapterPosition(view) != 0) {
                rect.top = resources.getDimensionPixelSize(R$dimen.debug_panel_space_medium_large);
            }
        } else {
            int dimensionPixelSize = resources.getDimensionPixelSize(R$dimen.debug_panel_space_small);
            rect.bottom = dimensionPixelSize;
            rect.top = dimensionPixelSize;
        }
    }
}
