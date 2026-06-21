package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ju0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f6941b = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f6942a = new ArrayList();

    public final void a(View view, wt0 wt0Var) {
        iu0 iu0Var;
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
        if (!f6941b.matcher("Ad overlay").matches()) {
            throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
        }
        ArrayList arrayList = this.f6942a;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                iu0Var = null;
                break;
            } else {
                iu0Var = (iu0) it.next();
                if (iu0Var.f6613a.get() == view) {
                    break;
                }
            }
        }
        if (iu0Var == null) {
            arrayList.add(new iu0(view, wt0Var));
        }
    }
}
