package yads;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;
import com.yandex.mobile.ads.R$string;
import com.yandex.mobile.ads.features.debugpanel.ui.IntegrationInspectorActivity;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class o90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IntegrationInspectorActivity f41494a;

    public o90(IntegrationInspectorActivity integrationInspectorActivity) {
        this.f41494a = integrationInspectorActivity;
    }

    public static final void a(DialogInterface dialogInterface, int i) {
    }

    public final void a(m90 m90Var) {
        if (m90Var instanceof j90) {
            Toast.makeText(this.f41494a, ((j90) m90Var).f39783a, 0).show();
            return;
        }
        if (m90Var instanceof l90) {
            a(((l90) m90Var).f40455a);
            return;
        }
        if (m90Var instanceof k90) {
            Uri uri = ((k90) m90Var).f40107a;
            Intent intent = new Intent();
            intent.setAction("android.intent.action.SEND");
            intent.putExtra("android.intent.extra.STREAM", uri);
            intent.setType("text/plain");
            this.f41494a.startActivity(intent);
            return;
        }
        if (m90Var instanceof i90) {
            a(this.f41494a.getString(R$string.debug_panel_logging_is_disabled), this.f41494a.getString(R$string.debug_panel_do_you_want_to_enable_logging), new n90(this));
        } else if (m90Var instanceof h90) {
            this.f41494a.finishAfterTransition();
        }
    }

    public static final void a(Function0 function0, DialogInterface dialogInterface, int i) {
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void a(String str) {
        new AlertDialog.Builder(this.f41494a).setMessage(str).setPositiveButton(this.f41494a.getString(R$string.debug_panel_ok), new zl.o0(0)).show();
    }

    public final void a(String str, String str2, n90 n90Var) {
        new AlertDialog.Builder(this.f41494a).setTitle(str).setMessage(str2).setPositiveButton(this.f41494a.getString(R$string.debug_panel_yes), new com.vk.api.sdk.ui.a(2, n90Var)).setNegativeButton(this.f41494a.getString(R$string.debug_panel_no), new zl.o0(1)).show();
    }

    public static final void b(DialogInterface dialogInterface, int i) {
    }
}
