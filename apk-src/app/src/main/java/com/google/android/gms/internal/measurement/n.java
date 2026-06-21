package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public interface n {
    public static final r B1 = new r();
    public static final l C1 = new l();
    public static final f D1 = new f("continue");
    public static final f E1 = new f("break");
    public static final f F1 = new f("return");
    public static final e G1 = new e(Boolean.TRUE);
    public static final e H1 = new e(Boolean.FALSE);
    public static final q I1 = new q("");

    n B();

    Iterator c();

    n e(String str, com.google.firebase.messaging.y yVar, ArrayList arrayList);

    Double g();

    Boolean i();

    String l();
}
