package yads;

import android.view.View;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.mobile.ads.R$id;
import com.yandex.mobile.ads.features.debugpanel.ui.IntegrationInspectorActivity;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class q90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w40 f42226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f42227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ProgressBar f42228c;

    public q90(IntegrationInspectorActivity integrationInspectorActivity, dc1 dc1Var, LinearLayoutManager linearLayoutManager, w40 w40Var) {
        this.f42226a = w40Var;
        ImageButton imageButton = (ImageButton) integrationInspectorActivity.findViewById(R$id.toolbar_navigation_button);
        this.f42227b = (TextView) integrationInspectorActivity.findViewById(R$id.toolbar_title);
        this.f42228c = (ProgressBar) integrationInspectorActivity.findViewById(R$id.loading_view);
        RecyclerView recyclerView = (RecyclerView) integrationInspectorActivity.findViewById(R$id.recycler_view);
        a80 a80Var = new a80();
        imageButton.setOnClickListener(new gh.a(4, dc1Var));
        int iA = (int) yo3.b(integrationInspectorActivity).a();
        recyclerView.setAdapter(w40Var);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.addItemDecoration(a80Var);
        recyclerView.setPadding(recyclerView.getPaddingLeft(), recyclerView.getPaddingTop(), recyclerView.getPaddingRight(), recyclerView.getPaddingBottom() + iA);
    }

    public static final void a(Function1 function1, View view) {
        function1.invoke(b90.f36966a);
    }
}
