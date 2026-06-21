package yads;

import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class xv3 extends jw3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashSet f44816c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final JSONObject f44817d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f44818e;

    public xv3(iw3 iw3Var, HashSet hashSet, JSONObject jSONObject, long j10) {
        super(iw3Var);
        this.f44816c = new HashSet(hashSet);
        this.f44817d = jSONObject;
        this.f44818e = j10;
    }
}
