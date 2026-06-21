package yads;

import android.webkit.WebView;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class bo3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ej2 f37117a;

    public bo3(ej2 ej2Var) {
        this.f37117a = ej2Var;
    }

    public final void a() {
        String strA = this.f37117a.a();
        String strM = strA != null ? StringsKt.M(strA, StringUtils.PROCESS_POSTFIX_DELIMITER, "") : null;
        if (strM == null || strM.length() <= 0) {
            return;
        }
        try {
            WebView.setDataDirectorySuffix(strM);
        } catch (Throwable unused) {
        }
    }
}
