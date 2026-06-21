package d8;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f15576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f15577c;

    public t a() {
        if ("first_party".equals(this.f15577c)) {
            throw new IllegalArgumentException("Serialized doc id must be provided for first party products.");
        }
        if (this.f15576b == null) {
            throw new IllegalArgumentException("Product id must be provided.");
        }
        if (this.f15577c != null) {
            return new t(this);
        }
        throw new IllegalArgumentException("Product type must be provided.");
    }

    public String b() {
        StringBuilder sb2 = new StringBuilder("Flutter-GMA-7.0.0");
        if (this.f15576b != null) {
            sb2.append("_News-");
            sb2.append(this.f15576b);
        }
        if (this.f15577c != null) {
            sb2.append("_Game-");
            sb2.append(this.f15577c);
        }
        return sb2.toString();
    }

    public String toString() {
        switch (this.f15575a) {
            case 8:
                return this.f15576b + ", " + this.f15577c;
            default:
                return super.toString();
        }
    }

    public /* synthetic */ a(a aVar) {
        this.f15575a = 4;
        this.f15576b = aVar.f15576b;
        this.f15577c = aVar.f15577c;
    }

    public /* synthetic */ a(String str, String str2, int i) {
        this.f15575a = i;
        this.f15576b = str;
        this.f15577c = str2;
    }
}
