package com.monetization.ads.exo.source.dash;

import android.net.Uri;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import yads.lb3;
import yads.r30;
import yads.rb2;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements rb2 {
    @Override // yads.rb2
    public final Object a(Uri uri, r30 r30Var) {
        return Long.valueOf(lb3.f(new BufferedReader(new InputStreamReader(r30Var)).readLine()));
    }
}
