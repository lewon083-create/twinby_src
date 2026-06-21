package yads;

import android.content.Context;
import android.graphics.Typeface;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class iw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f39653a;

    public iw0(Context context) {
        this.f39653a = context;
    }

    public final Typeface a(tw0 tw0Var) {
        try {
            File fileB = b(tw0Var);
            if (fileB.exists()) {
                return Typeface.createFromFile(fileB);
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public final File b(tw0 tw0Var) {
        return new File(new File(this.f39653a.getFilesDir(), "downloaded_fonts"), j43.a(com.google.android.gms.internal.ads.om1.x(tw0Var.name(), ".ttf")));
    }
}
