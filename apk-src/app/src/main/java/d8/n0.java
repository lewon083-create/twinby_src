package d8;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n0 {
    public static final j A;
    public static final j B;
    public static final j C;
    public static final j D;
    public static final j E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f15660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j f15661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j f15662c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final j f15663d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final j f15664e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final j f15665f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final j f15666g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final j f15667h;
    public static final j i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final j f15668j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final j f15669k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final j f15670l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final j f15671m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j f15672n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final j f15673o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final j f15674p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final j f15675q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final j f15676r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final j f15677s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final j f15678t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final j f15679u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final j f15680v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final j f15681w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final j f15682x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final j f15683y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final j f15684z;

    static {
        i iVarA = j.a();
        iVarA.f15634b = 3;
        iVarA.f15635c = "Google Play In-app Billing API version is less than 3";
        f15660a = iVarA.a();
        i iVarA2 = j.a();
        iVarA2.f15634b = 3;
        iVarA2.f15635c = "Google Play In-app Billing API version is less than 9";
        f15661b = iVarA2.a();
        i iVarA3 = j.a();
        iVarA3.f15634b = 3;
        iVarA3.f15635c = "Billing service unavailable on device.";
        f15662c = iVarA3.a();
        i iVarA4 = j.a();
        iVarA4.f15634b = 2;
        iVarA4.f15635c = "Billing service unavailable on device.";
        f15663d = iVarA4.a();
        i iVarA5 = j.a();
        iVarA5.f15634b = 5;
        iVarA5.f15635c = "Client is already in the process of connecting to billing service.";
        f15664e = iVarA5.a();
        i iVarA6 = j.a();
        iVarA6.f15634b = 5;
        iVarA6.f15635c = "The list of SKUs can't be empty.";
        iVarA6.a();
        i iVarA7 = j.a();
        iVarA7.f15634b = 5;
        iVarA7.f15635c = "SKU type can't be empty.";
        iVarA7.a();
        i iVarA8 = j.a();
        iVarA8.f15634b = 5;
        iVarA8.f15635c = "Product type can't be empty.";
        f15665f = iVarA8.a();
        i iVarA9 = j.a();
        iVarA9.f15634b = -2;
        iVarA9.f15635c = "Client does not support extra params.";
        f15666g = iVarA9.a();
        i iVarA10 = j.a();
        iVarA10.f15634b = 5;
        iVarA10.f15635c = "Invalid purchase token.";
        f15667h = iVarA10.a();
        i iVarA11 = j.a();
        iVarA11.f15634b = 6;
        iVarA11.f15635c = "An internal error occurred.";
        i = iVarA11.a();
        i iVarA12 = j.a();
        iVarA12.f15634b = 5;
        iVarA12.f15635c = "SKU can't be null.";
        iVarA12.a();
        i iVarA13 = j.a();
        iVarA13.f15634b = 0;
        f15668j = iVarA13.a();
        i iVarA14 = j.a();
        iVarA14.f15634b = -1;
        iVarA14.f15635c = "Service connection is disconnected.";
        f15669k = iVarA14.a();
        i iVarA15 = j.a();
        iVarA15.f15634b = 2;
        iVarA15.f15635c = "Timeout communicating with service.";
        f15670l = iVarA15.a();
        i iVarA16 = j.a();
        iVarA16.f15634b = -2;
        iVarA16.f15635c = "Client does not support subscriptions.";
        f15671m = iVarA16.a();
        i iVarA17 = j.a();
        iVarA17.f15634b = -2;
        iVarA17.f15635c = "Client does not support subscriptions update.";
        f15672n = iVarA17.a();
        i iVarA18 = j.a();
        iVarA18.f15634b = -2;
        iVarA18.f15635c = "Client does not support get purchase history.";
        f15673o = iVarA18.a();
        i iVarA19 = j.a();
        iVarA19.f15634b = -2;
        iVarA19.f15635c = "Client does not support price change confirmation.";
        f15674p = iVarA19.a();
        i iVarA20 = j.a();
        iVarA20.f15634b = -2;
        iVarA20.f15635c = "Play Store version installed does not support cross selling products.";
        f15675q = iVarA20.a();
        i iVarA21 = j.a();
        iVarA21.f15634b = -2;
        iVarA21.f15635c = "Client does not support multi-item purchases.";
        f15676r = iVarA21.a();
        i iVarA22 = j.a();
        iVarA22.f15634b = -2;
        iVarA22.f15635c = "Client does not support offer_id_token.";
        f15677s = iVarA22.a();
        i iVarA23 = j.a();
        iVarA23.f15634b = -2;
        iVarA23.f15635c = "Client does not support ProductDetails.";
        f15678t = iVarA23.a();
        i iVarA24 = j.a();
        iVarA24.f15634b = -2;
        iVarA24.f15635c = "Client does not support in-app messages.";
        f15679u = iVarA24.a();
        i iVarA25 = j.a();
        iVarA25.f15634b = -2;
        iVarA25.f15635c = "Client does not support user choice billing.";
        iVarA25.a();
        i iVarA26 = j.a();
        iVarA26.f15634b = -2;
        iVarA26.f15635c = "Play Store version installed does not support external offer.";
        f15680v = iVarA26.a();
        i iVarA27 = j.a();
        iVarA27.f15634b = -2;
        iVarA27.f15635c = "Play Store version installed does not support multi-item purchases with season pass in one cart.";
        f15681w = iVarA27.a();
        i iVarA28 = j.a();
        iVarA28.f15634b = 5;
        iVarA28.f15635c = "Unknown feature";
        f15682x = iVarA28.a();
        i iVarA29 = j.a();
        iVarA29.f15634b = -2;
        iVarA29.f15635c = "Play Store version installed does not support get billing config.";
        f15683y = iVarA29.a();
        i iVarA30 = j.a();
        iVarA30.f15634b = -2;
        iVarA30.f15635c = "Query product details with serialized docid is not supported.";
        f15684z = iVarA30.a();
        i iVarA31 = j.a();
        iVarA31.f15634b = 4;
        iVarA31.f15635c = "Item is unavailable for purchase.";
        A = iVarA31.a();
        i iVarA32 = j.a();
        iVarA32.f15634b = -2;
        iVarA32.f15635c = "Query product details with developer specified account is not supported.";
        B = iVarA32.a();
        i iVarA33 = j.a();
        iVarA33.f15634b = -2;
        iVarA33.f15635c = "Play Store version installed does not support alternative billing only.";
        C = iVarA33.a();
        i iVarA34 = j.a();
        iVarA34.f15634b = 5;
        iVarA34.f15635c = "To use this API you must specify a PurchasesUpdateListener when initializing a BillingClient.";
        D = iVarA34.a();
        i iVarA35 = j.a();
        iVarA35.f15634b = 6;
        iVarA35.f15635c = "An error occurred while retrieving billing override.";
        E = iVarA35.a();
    }

    public static j a(int i10, String str) {
        i iVarA = j.a();
        iVarA.f15634b = i10;
        iVarA.f15635c = str;
        return iVarA.a();
    }
}
