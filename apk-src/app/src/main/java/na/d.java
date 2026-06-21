package na;

import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class d extends Exception {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Status f29186b;

    public d(Status status) {
        int i = status.f2633b;
        String str = status.f2634c;
        str = str == null ? "" : str;
        StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 2 + String.valueOf(str).length());
        sb2.append(i);
        sb2.append(": ");
        sb2.append(str);
        super(sb2.toString());
        this.f29186b = status;
    }
}
