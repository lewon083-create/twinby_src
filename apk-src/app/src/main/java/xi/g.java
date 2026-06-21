package xi;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Build;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class g implements ii.s, ii.u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f36222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Activity f36223c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ti.b f36224d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ti.m f36225e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d f36226f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ni.i f36227g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ti.t f36228h;
    public final ExecutorService i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f36229j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Uri f36230k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public x7.b f36231l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Object f36232m;

    public g(Activity activity, ti.b bVar, ti.m mVar) {
        d dVar = new d(activity);
        ni.i iVar = new ni.i(25, activity);
        ti.t tVar = new ti.t(6);
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        this.f36232m = new Object();
        this.f36223c = activity;
        this.f36224d = bVar;
        this.f36222b = activity.getPackageName() + ".flutter.image_provider";
        this.f36226f = dVar;
        this.f36227g = iVar;
        this.f36228h = tVar;
        this.f36225e = mVar;
        this.i = executorServiceNewSingleThreadExecutor;
    }

    public static void c(jh.b bVar) {
        bVar.c(new m("already_active", "Image picker is already active"));
    }

    @Override // ii.s
    public final boolean a(int i, final int i10, final Intent intent) {
        Runnable runnable;
        if (i == 2342) {
            final int i11 = 0;
            runnable = new Runnable(this) { // from class: xi.a

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ g f36210c;

                {
                    this.f36210c = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    Intent intent2;
                    Intent intent3;
                    Intent intent4;
                    Intent intent5;
                    Intent intent6;
                    switch (i11) {
                        case 0:
                            g gVar = this.f36210c;
                            gVar.getClass();
                            if (i10 == -1 && (intent2 = intent) != null) {
                                ArrayList arrayListG = gVar.g(intent2, false);
                                if (arrayListG != null) {
                                    gVar.i(arrayListG);
                                } else {
                                    gVar.d("no_valid_image_uri", "Cannot find the selected image.");
                                }
                            } else {
                                gVar.f(null);
                            }
                            break;
                        case 1:
                            g gVar2 = this.f36210c;
                            gVar2.getClass();
                            if (i10 == -1 && (intent3 = intent) != null) {
                                ArrayList arrayListG2 = gVar2.g(intent3, false);
                                if (arrayListG2 != null) {
                                    gVar2.i(arrayListG2);
                                } else {
                                    gVar2.d("missing_valid_image_uri", "Cannot find at least one of the selected images.");
                                }
                            } else {
                                gVar2.f(null);
                            }
                            break;
                        case 2:
                            g gVar3 = this.f36210c;
                            gVar3.getClass();
                            if (i10 == -1 && (intent4 = intent) != null) {
                                ArrayList arrayListG3 = gVar3.g(intent4, false);
                                if (arrayListG3 != null) {
                                    gVar3.i(arrayListG3);
                                } else {
                                    gVar3.d("missing_valid_video_uri", "Cannot find at least one of the selected videos.");
                                }
                            } else {
                                gVar3.f(null);
                            }
                            break;
                        case 3:
                            g gVar4 = this.f36210c;
                            gVar4.getClass();
                            if (i10 == -1 && (intent5 = intent) != null) {
                                ArrayList arrayListG4 = gVar4.g(intent5, true);
                                if (arrayListG4 != null) {
                                    gVar4.i(arrayListG4);
                                } else {
                                    gVar4.d("no_valid_media_uri", "Cannot find the selected media.");
                                }
                            } else {
                                gVar4.f(null);
                            }
                            break;
                        default:
                            g gVar5 = this.f36210c;
                            gVar5.getClass();
                            if (i10 == -1 && (intent6 = intent) != null) {
                                ArrayList arrayListG5 = gVar5.g(intent6, false);
                                if (arrayListG5 != null && arrayListG5.size() >= 1) {
                                    gVar5.f(((f) arrayListG5.get(0)).f36220a);
                                } else {
                                    gVar5.d("no_valid_video_uri", "Cannot find the selected video.");
                                }
                            } else {
                                gVar5.f(null);
                            }
                            break;
                    }
                }
            };
        } else if (i == 2343) {
            final int i12 = 0;
            runnable = new Runnable(this) { // from class: xi.b

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ g f36214c;

                {
                    this.f36214c = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i12) {
                        case 0:
                            int i13 = i10;
                            g gVar = this.f36214c;
                            if (i13 != -1) {
                                gVar.f(null);
                            } else {
                                Uri uri = gVar.f36230k;
                                ni.i iVar = gVar.f36227g;
                                if (uri == null) {
                                    uri = Uri.parse(gVar.f36225e.f33853a.getSharedPreferences("flutter_image_picker_shared_preference", 0).getString("flutter_image_picker_pending_image_uri", ""));
                                }
                                final c cVar = new c(gVar, 0);
                                MediaScannerConnection.scanFile((Activity) iVar.f29407c, new String[]{uri != null ? uri.getPath() : ""}, null, new MediaScannerConnection.OnScanCompletedListener() { // from class: xi.e
                                    @Override // android.media.MediaScannerConnection.OnScanCompletedListener
                                    public final void onScanCompleted(String str, Uri uri2) {
                                        p pVar;
                                        c cVar2 = cVar;
                                        int i14 = cVar2.f36216a;
                                        g gVar2 = cVar2.f36217b;
                                        switch (i14) {
                                            case 0:
                                                synchronized (gVar2.f36232m) {
                                                    x7.b bVar = gVar2.f36231l;
                                                    pVar = bVar != null ? (p) bVar.f35977b : null;
                                                    break;
                                                }
                                                if (pVar == null) {
                                                    gVar2.f(str);
                                                    return;
                                                }
                                                String strF = gVar2.f36224d.f(str, pVar.f36252a, pVar.f36253b, pVar.f36254c.intValue());
                                                if (strF != null && !strF.equals(str)) {
                                                    new File(str).delete();
                                                }
                                                gVar2.f(strF);
                                                return;
                                            default:
                                                gVar2.f(str);
                                                return;
                                        }
                                    }
                                });
                            }
                            break;
                        default:
                            int i14 = i10;
                            g gVar2 = this.f36214c;
                            if (i14 != -1) {
                                gVar2.f(null);
                            } else {
                                Uri uri2 = gVar2.f36230k;
                                ni.i iVar2 = gVar2.f36227g;
                                if (uri2 == null) {
                                    uri2 = Uri.parse(gVar2.f36225e.f33853a.getSharedPreferences("flutter_image_picker_shared_preference", 0).getString("flutter_image_picker_pending_image_uri", ""));
                                }
                                final c cVar2 = new c(gVar2, 1);
                                MediaScannerConnection.scanFile((Activity) iVar2.f29407c, new String[]{uri2 != null ? uri2.getPath() : ""}, null, new MediaScannerConnection.OnScanCompletedListener() { // from class: xi.e
                                    @Override // android.media.MediaScannerConnection.OnScanCompletedListener
                                    public final void onScanCompleted(String str, Uri uri22) {
                                        p pVar;
                                        c cVar22 = cVar2;
                                        int i142 = cVar22.f36216a;
                                        g gVar22 = cVar22.f36217b;
                                        switch (i142) {
                                            case 0:
                                                synchronized (gVar22.f36232m) {
                                                    x7.b bVar = gVar22.f36231l;
                                                    pVar = bVar != null ? (p) bVar.f35977b : null;
                                                    break;
                                                }
                                                if (pVar == null) {
                                                    gVar22.f(str);
                                                    return;
                                                }
                                                String strF = gVar22.f36224d.f(str, pVar.f36252a, pVar.f36253b, pVar.f36254c.intValue());
                                                if (strF != null && !strF.equals(str)) {
                                                    new File(str).delete();
                                                }
                                                gVar22.f(strF);
                                                return;
                                            default:
                                                gVar22.f(str);
                                                return;
                                        }
                                    }
                                });
                            }
                            break;
                    }
                }
            };
        } else if (i == 2352) {
            final int i13 = 4;
            runnable = new Runnable(this) { // from class: xi.a

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ g f36210c;

                {
                    this.f36210c = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    Intent intent2;
                    Intent intent3;
                    Intent intent4;
                    Intent intent5;
                    Intent intent6;
                    switch (i13) {
                        case 0:
                            g gVar = this.f36210c;
                            gVar.getClass();
                            if (i10 == -1 && (intent2 = intent) != null) {
                                ArrayList arrayListG = gVar.g(intent2, false);
                                if (arrayListG != null) {
                                    gVar.i(arrayListG);
                                } else {
                                    gVar.d("no_valid_image_uri", "Cannot find the selected image.");
                                }
                            } else {
                                gVar.f(null);
                            }
                            break;
                        case 1:
                            g gVar2 = this.f36210c;
                            gVar2.getClass();
                            if (i10 == -1 && (intent3 = intent) != null) {
                                ArrayList arrayListG2 = gVar2.g(intent3, false);
                                if (arrayListG2 != null) {
                                    gVar2.i(arrayListG2);
                                } else {
                                    gVar2.d("missing_valid_image_uri", "Cannot find at least one of the selected images.");
                                }
                            } else {
                                gVar2.f(null);
                            }
                            break;
                        case 2:
                            g gVar3 = this.f36210c;
                            gVar3.getClass();
                            if (i10 == -1 && (intent4 = intent) != null) {
                                ArrayList arrayListG3 = gVar3.g(intent4, false);
                                if (arrayListG3 != null) {
                                    gVar3.i(arrayListG3);
                                } else {
                                    gVar3.d("missing_valid_video_uri", "Cannot find at least one of the selected videos.");
                                }
                            } else {
                                gVar3.f(null);
                            }
                            break;
                        case 3:
                            g gVar4 = this.f36210c;
                            gVar4.getClass();
                            if (i10 == -1 && (intent5 = intent) != null) {
                                ArrayList arrayListG4 = gVar4.g(intent5, true);
                                if (arrayListG4 != null) {
                                    gVar4.i(arrayListG4);
                                } else {
                                    gVar4.d("no_valid_media_uri", "Cannot find the selected media.");
                                }
                            } else {
                                gVar4.f(null);
                            }
                            break;
                        default:
                            g gVar5 = this.f36210c;
                            gVar5.getClass();
                            if (i10 == -1 && (intent6 = intent) != null) {
                                ArrayList arrayListG5 = gVar5.g(intent6, false);
                                if (arrayListG5 != null && arrayListG5.size() >= 1) {
                                    gVar5.f(((f) arrayListG5.get(0)).f36220a);
                                } else {
                                    gVar5.d("no_valid_video_uri", "Cannot find the selected video.");
                                }
                            } else {
                                gVar5.f(null);
                            }
                            break;
                    }
                }
            };
        } else if (i != 2353) {
            switch (i) {
                case 2346:
                    final int i14 = 1;
                    runnable = new Runnable(this) { // from class: xi.a

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        public final /* synthetic */ g f36210c;

                        {
                            this.f36210c = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            Intent intent2;
                            Intent intent3;
                            Intent intent4;
                            Intent intent5;
                            Intent intent6;
                            switch (i14) {
                                case 0:
                                    g gVar = this.f36210c;
                                    gVar.getClass();
                                    if (i10 == -1 && (intent2 = intent) != null) {
                                        ArrayList arrayListG = gVar.g(intent2, false);
                                        if (arrayListG != null) {
                                            gVar.i(arrayListG);
                                        } else {
                                            gVar.d("no_valid_image_uri", "Cannot find the selected image.");
                                        }
                                    } else {
                                        gVar.f(null);
                                    }
                                    break;
                                case 1:
                                    g gVar2 = this.f36210c;
                                    gVar2.getClass();
                                    if (i10 == -1 && (intent3 = intent) != null) {
                                        ArrayList arrayListG2 = gVar2.g(intent3, false);
                                        if (arrayListG2 != null) {
                                            gVar2.i(arrayListG2);
                                        } else {
                                            gVar2.d("missing_valid_image_uri", "Cannot find at least one of the selected images.");
                                        }
                                    } else {
                                        gVar2.f(null);
                                    }
                                    break;
                                case 2:
                                    g gVar3 = this.f36210c;
                                    gVar3.getClass();
                                    if (i10 == -1 && (intent4 = intent) != null) {
                                        ArrayList arrayListG3 = gVar3.g(intent4, false);
                                        if (arrayListG3 != null) {
                                            gVar3.i(arrayListG3);
                                        } else {
                                            gVar3.d("missing_valid_video_uri", "Cannot find at least one of the selected videos.");
                                        }
                                    } else {
                                        gVar3.f(null);
                                    }
                                    break;
                                case 3:
                                    g gVar4 = this.f36210c;
                                    gVar4.getClass();
                                    if (i10 == -1 && (intent5 = intent) != null) {
                                        ArrayList arrayListG4 = gVar4.g(intent5, true);
                                        if (arrayListG4 != null) {
                                            gVar4.i(arrayListG4);
                                        } else {
                                            gVar4.d("no_valid_media_uri", "Cannot find the selected media.");
                                        }
                                    } else {
                                        gVar4.f(null);
                                    }
                                    break;
                                default:
                                    g gVar5 = this.f36210c;
                                    gVar5.getClass();
                                    if (i10 == -1 && (intent6 = intent) != null) {
                                        ArrayList arrayListG5 = gVar5.g(intent6, false);
                                        if (arrayListG5 != null && arrayListG5.size() >= 1) {
                                            gVar5.f(((f) arrayListG5.get(0)).f36220a);
                                        } else {
                                            gVar5.d("no_valid_video_uri", "Cannot find the selected video.");
                                        }
                                    } else {
                                        gVar5.f(null);
                                    }
                                    break;
                            }
                        }
                    };
                    break;
                case 2347:
                    final int i15 = 3;
                    runnable = new Runnable(this) { // from class: xi.a

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        public final /* synthetic */ g f36210c;

                        {
                            this.f36210c = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            Intent intent2;
                            Intent intent3;
                            Intent intent4;
                            Intent intent5;
                            Intent intent6;
                            switch (i15) {
                                case 0:
                                    g gVar = this.f36210c;
                                    gVar.getClass();
                                    if (i10 == -1 && (intent2 = intent) != null) {
                                        ArrayList arrayListG = gVar.g(intent2, false);
                                        if (arrayListG != null) {
                                            gVar.i(arrayListG);
                                        } else {
                                            gVar.d("no_valid_image_uri", "Cannot find the selected image.");
                                        }
                                    } else {
                                        gVar.f(null);
                                    }
                                    break;
                                case 1:
                                    g gVar2 = this.f36210c;
                                    gVar2.getClass();
                                    if (i10 == -1 && (intent3 = intent) != null) {
                                        ArrayList arrayListG2 = gVar2.g(intent3, false);
                                        if (arrayListG2 != null) {
                                            gVar2.i(arrayListG2);
                                        } else {
                                            gVar2.d("missing_valid_image_uri", "Cannot find at least one of the selected images.");
                                        }
                                    } else {
                                        gVar2.f(null);
                                    }
                                    break;
                                case 2:
                                    g gVar3 = this.f36210c;
                                    gVar3.getClass();
                                    if (i10 == -1 && (intent4 = intent) != null) {
                                        ArrayList arrayListG3 = gVar3.g(intent4, false);
                                        if (arrayListG3 != null) {
                                            gVar3.i(arrayListG3);
                                        } else {
                                            gVar3.d("missing_valid_video_uri", "Cannot find at least one of the selected videos.");
                                        }
                                    } else {
                                        gVar3.f(null);
                                    }
                                    break;
                                case 3:
                                    g gVar4 = this.f36210c;
                                    gVar4.getClass();
                                    if (i10 == -1 && (intent5 = intent) != null) {
                                        ArrayList arrayListG4 = gVar4.g(intent5, true);
                                        if (arrayListG4 != null) {
                                            gVar4.i(arrayListG4);
                                        } else {
                                            gVar4.d("no_valid_media_uri", "Cannot find the selected media.");
                                        }
                                    } else {
                                        gVar4.f(null);
                                    }
                                    break;
                                default:
                                    g gVar5 = this.f36210c;
                                    gVar5.getClass();
                                    if (i10 == -1 && (intent6 = intent) != null) {
                                        ArrayList arrayListG5 = gVar5.g(intent6, false);
                                        if (arrayListG5 != null && arrayListG5.size() >= 1) {
                                            gVar5.f(((f) arrayListG5.get(0)).f36220a);
                                        } else {
                                            gVar5.d("no_valid_video_uri", "Cannot find the selected video.");
                                        }
                                    } else {
                                        gVar5.f(null);
                                    }
                                    break;
                            }
                        }
                    };
                    break;
                case 2348:
                    final int i16 = 2;
                    runnable = new Runnable(this) { // from class: xi.a

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        public final /* synthetic */ g f36210c;

                        {
                            this.f36210c = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            Intent intent2;
                            Intent intent3;
                            Intent intent4;
                            Intent intent5;
                            Intent intent6;
                            switch (i16) {
                                case 0:
                                    g gVar = this.f36210c;
                                    gVar.getClass();
                                    if (i10 == -1 && (intent2 = intent) != null) {
                                        ArrayList arrayListG = gVar.g(intent2, false);
                                        if (arrayListG != null) {
                                            gVar.i(arrayListG);
                                        } else {
                                            gVar.d("no_valid_image_uri", "Cannot find the selected image.");
                                        }
                                    } else {
                                        gVar.f(null);
                                    }
                                    break;
                                case 1:
                                    g gVar2 = this.f36210c;
                                    gVar2.getClass();
                                    if (i10 == -1 && (intent3 = intent) != null) {
                                        ArrayList arrayListG2 = gVar2.g(intent3, false);
                                        if (arrayListG2 != null) {
                                            gVar2.i(arrayListG2);
                                        } else {
                                            gVar2.d("missing_valid_image_uri", "Cannot find at least one of the selected images.");
                                        }
                                    } else {
                                        gVar2.f(null);
                                    }
                                    break;
                                case 2:
                                    g gVar3 = this.f36210c;
                                    gVar3.getClass();
                                    if (i10 == -1 && (intent4 = intent) != null) {
                                        ArrayList arrayListG3 = gVar3.g(intent4, false);
                                        if (arrayListG3 != null) {
                                            gVar3.i(arrayListG3);
                                        } else {
                                            gVar3.d("missing_valid_video_uri", "Cannot find at least one of the selected videos.");
                                        }
                                    } else {
                                        gVar3.f(null);
                                    }
                                    break;
                                case 3:
                                    g gVar4 = this.f36210c;
                                    gVar4.getClass();
                                    if (i10 == -1 && (intent5 = intent) != null) {
                                        ArrayList arrayListG4 = gVar4.g(intent5, true);
                                        if (arrayListG4 != null) {
                                            gVar4.i(arrayListG4);
                                        } else {
                                            gVar4.d("no_valid_media_uri", "Cannot find the selected media.");
                                        }
                                    } else {
                                        gVar4.f(null);
                                    }
                                    break;
                                default:
                                    g gVar5 = this.f36210c;
                                    gVar5.getClass();
                                    if (i10 == -1 && (intent6 = intent) != null) {
                                        ArrayList arrayListG5 = gVar5.g(intent6, false);
                                        if (arrayListG5 != null && arrayListG5.size() >= 1) {
                                            gVar5.f(((f) arrayListG5.get(0)).f36220a);
                                        } else {
                                            gVar5.d("no_valid_video_uri", "Cannot find the selected video.");
                                        }
                                    } else {
                                        gVar5.f(null);
                                    }
                                    break;
                            }
                        }
                    };
                    break;
                default:
                    return false;
            }
        } else {
            final int i17 = 1;
            runnable = new Runnable(this) { // from class: xi.b

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ g f36214c;

                {
                    this.f36214c = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i17) {
                        case 0:
                            int i132 = i10;
                            g gVar = this.f36214c;
                            if (i132 != -1) {
                                gVar.f(null);
                            } else {
                                Uri uri = gVar.f36230k;
                                ni.i iVar = gVar.f36227g;
                                if (uri == null) {
                                    uri = Uri.parse(gVar.f36225e.f33853a.getSharedPreferences("flutter_image_picker_shared_preference", 0).getString("flutter_image_picker_pending_image_uri", ""));
                                }
                                final c cVar = new c(gVar, 0);
                                MediaScannerConnection.scanFile((Activity) iVar.f29407c, new String[]{uri != null ? uri.getPath() : ""}, null, new MediaScannerConnection.OnScanCompletedListener() { // from class: xi.e
                                    @Override // android.media.MediaScannerConnection.OnScanCompletedListener
                                    public final void onScanCompleted(String str, Uri uri22) {
                                        p pVar;
                                        c cVar22 = cVar;
                                        int i142 = cVar22.f36216a;
                                        g gVar22 = cVar22.f36217b;
                                        switch (i142) {
                                            case 0:
                                                synchronized (gVar22.f36232m) {
                                                    x7.b bVar = gVar22.f36231l;
                                                    pVar = bVar != null ? (p) bVar.f35977b : null;
                                                    break;
                                                }
                                                if (pVar == null) {
                                                    gVar22.f(str);
                                                    return;
                                                }
                                                String strF = gVar22.f36224d.f(str, pVar.f36252a, pVar.f36253b, pVar.f36254c.intValue());
                                                if (strF != null && !strF.equals(str)) {
                                                    new File(str).delete();
                                                }
                                                gVar22.f(strF);
                                                return;
                                            default:
                                                gVar22.f(str);
                                                return;
                                        }
                                    }
                                });
                            }
                            break;
                        default:
                            int i142 = i10;
                            g gVar2 = this.f36214c;
                            if (i142 != -1) {
                                gVar2.f(null);
                            } else {
                                Uri uri2 = gVar2.f36230k;
                                ni.i iVar2 = gVar2.f36227g;
                                if (uri2 == null) {
                                    uri2 = Uri.parse(gVar2.f36225e.f33853a.getSharedPreferences("flutter_image_picker_shared_preference", 0).getString("flutter_image_picker_pending_image_uri", ""));
                                }
                                final c cVar2 = new c(gVar2, 1);
                                MediaScannerConnection.scanFile((Activity) iVar2.f29407c, new String[]{uri2 != null ? uri2.getPath() : ""}, null, new MediaScannerConnection.OnScanCompletedListener() { // from class: xi.e
                                    @Override // android.media.MediaScannerConnection.OnScanCompletedListener
                                    public final void onScanCompleted(String str, Uri uri22) {
                                        p pVar;
                                        c cVar22 = cVar2;
                                        int i1422 = cVar22.f36216a;
                                        g gVar22 = cVar22.f36217b;
                                        switch (i1422) {
                                            case 0:
                                                synchronized (gVar22.f36232m) {
                                                    x7.b bVar = gVar22.f36231l;
                                                    pVar = bVar != null ? (p) bVar.f35977b : null;
                                                    break;
                                                }
                                                if (pVar == null) {
                                                    gVar22.f(str);
                                                    return;
                                                }
                                                String strF = gVar22.f36224d.f(str, pVar.f36252a, pVar.f36253b, pVar.f36254c.intValue());
                                                if (strF != null && !strF.equals(str)) {
                                                    new File(str).delete();
                                                }
                                                gVar22.f(strF);
                                                return;
                                            default:
                                                gVar22.f(str);
                                                return;
                                        }
                                    }
                                });
                            }
                            break;
                    }
                }
            };
        }
        this.i.execute(runnable);
        return true;
    }

    @Override // ii.u
    public final boolean b(int i, String[] strArr, int[] iArr) {
        boolean z5 = iArr.length > 0 && iArr[0] == 0;
        if (i != 2345) {
            if (i != 2355) {
                return false;
            }
            if (z5) {
                k();
            }
        } else if (z5) {
            j();
        }
        if (!z5 && (i == 2345 || i == 2355)) {
            d("camera_access_denied", "The user did not allow camera access.");
        }
        return true;
    }

    public final void d(String str, String str2) {
        jh.b bVar;
        synchronized (this.f36232m) {
            x7.b bVar2 = this.f36231l;
            bVar = bVar2 != null ? (jh.b) bVar2.f35979d : null;
            this.f36231l = null;
        }
        if (bVar == null) {
            this.f36225e.b(str, str2, null);
        } else {
            bVar.c(new m(str, str2));
        }
    }

    public final void e(ArrayList arrayList) {
        jh.b bVar;
        synchronized (this.f36232m) {
            x7.b bVar2 = this.f36231l;
            bVar = bVar2 != null ? (jh.b) bVar2.f35979d : null;
            this.f36231l = null;
        }
        if (bVar == null) {
            this.f36225e.b(null, null, arrayList);
        } else {
            bVar.f(arrayList);
        }
    }

    public final void f(String str) {
        jh.b bVar;
        ArrayList arrayList = new ArrayList();
        if (str != null) {
            arrayList.add(str);
        }
        synchronized (this.f36232m) {
            x7.b bVar2 = this.f36231l;
            bVar = bVar2 != null ? (jh.b) bVar2.f35979d : null;
            this.f36231l = null;
        }
        if (bVar != null) {
            bVar.f(arrayList);
        } else {
            if (arrayList.isEmpty()) {
                return;
            }
            this.f36225e.b(null, null, arrayList);
        }
    }

    public final ArrayList g(Intent intent, boolean z5) {
        ArrayList arrayList = new ArrayList();
        Uri data = intent.getData();
        ti.t tVar = this.f36228h;
        Activity activity = this.f36223c;
        if (data != null) {
            tVar.getClass();
            String strG = ti.t.g(activity, data);
            if (strG != null) {
                arrayList.add(new f(strG, null));
                return arrayList;
            }
        } else if (intent.getClipData() != null) {
            for (int i = 0; i < intent.getClipData().getItemCount(); i++) {
                Uri uri = intent.getClipData().getItemAt(i).getUri();
                if (uri != null) {
                    tVar.getClass();
                    String strG2 = ti.t.g(activity, uri);
                    if (strG2 != null) {
                        arrayList.add(new f(strG2, z5 ? activity.getContentResolver().getType(uri) : null));
                    }
                }
            }
            return arrayList;
        }
        return null;
    }

    public final void h(Intent intent, Uri uri) {
        Activity activity = this.f36223c;
        PackageManager packageManager = activity.getPackageManager();
        Iterator<ResolveInfo> it = (Build.VERSION.SDK_INT >= 33 ? packageManager.queryIntentActivities(intent, PackageManager.ResolveInfoFlags.of(65536L)) : packageManager.queryIntentActivities(intent, 65536)).iterator();
        while (it.hasNext()) {
            activity.grantUriPermission(it.next().activityInfo.packageName, uri, 3);
        }
    }

    public final void i(ArrayList arrayList) {
        p pVar;
        synchronized (this.f36232m) {
            x7.b bVar = this.f36231l;
            pVar = bVar != null ? (p) bVar.f35977b : null;
        }
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        if (pVar == null) {
            while (i < arrayList.size()) {
                arrayList2.add(((f) arrayList.get(i)).f36220a);
                i++;
            }
            e(arrayList2);
            return;
        }
        while (i < arrayList.size()) {
            f fVar = (f) arrayList.get(i);
            String strF = fVar.f36220a;
            String str = fVar.f36221b;
            if (str == null || !str.startsWith("video/")) {
                strF = this.f36224d.f(fVar.f36220a, pVar.f36252a, pVar.f36253b, pVar.f36254c.intValue());
            }
            arrayList2.add(strF);
            i++;
        }
        e(arrayList2);
    }

    public final void j() {
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        if (this.f36229j == 2) {
            intent.putExtra("android.intent.extras.CAMERA_FACING", 0);
            if (Build.VERSION.SDK_INT >= 26) {
                intent.putExtra("android.intent.extra.USE_FRONT_CAMERA", true);
            }
        }
        String string = UUID.randomUUID().toString();
        Activity activity = this.f36223c;
        File cacheDir = activity.getCacheDir();
        try {
            cacheDir.mkdirs();
            File fileCreateTempFile = File.createTempFile(string, ".jpg", cacheDir);
            this.f36230k = Uri.parse("file:" + fileCreateTempFile.getAbsolutePath());
            Uri uriForFile = u1.c.getUriForFile((Activity) this.f36227g.f29407c, this.f36222b, fileCreateTempFile);
            intent.putExtra("output", uriForFile);
            h(intent, uriForFile);
            try {
                try {
                    activity.startActivityForResult(intent, 2343);
                } catch (SecurityException e3) {
                    e3.printStackTrace();
                    d("no_available_camera", "No cameras available for taking pictures.");
                }
            } catch (ActivityNotFoundException unused) {
                fileCreateTempFile.delete();
                d("no_available_camera", "No cameras available for taking pictures.");
            }
        } catch (IOException e7) {
            throw new RuntimeException(e7);
        }
    }

    public final void k() {
        v vVar;
        Long l10;
        Intent intent = new Intent("android.media.action.VIDEO_CAPTURE");
        synchronized (this.f36232m) {
            x7.b bVar = this.f36231l;
            vVar = bVar != null ? (v) bVar.f35978c : null;
        }
        if (vVar != null && (l10 = vVar.f36263a) != null) {
            intent.putExtra("android.intent.extra.durationLimit", l10.intValue());
        }
        if (this.f36229j == 2) {
            intent.putExtra("android.intent.extras.CAMERA_FACING", 0);
            if (Build.VERSION.SDK_INT >= 26) {
                intent.putExtra("android.intent.extra.USE_FRONT_CAMERA", true);
            }
        }
        String string = UUID.randomUUID().toString();
        File cacheDir = this.f36223c.getCacheDir();
        try {
            cacheDir.mkdirs();
            File fileCreateTempFile = File.createTempFile(string, ".mp4", cacheDir);
            this.f36230k = Uri.parse("file:" + fileCreateTempFile.getAbsolutePath());
            Uri uriForFile = u1.c.getUriForFile((Activity) this.f36227g.f29407c, this.f36222b, fileCreateTempFile);
            intent.putExtra("output", uriForFile);
            h(intent, uriForFile);
            try {
                try {
                    this.f36223c.startActivityForResult(intent, 2353);
                } catch (SecurityException e3) {
                    e3.printStackTrace();
                    d("no_available_camera", "No cameras available for taking pictures.");
                }
            } catch (ActivityNotFoundException unused) {
                fileCreateTempFile.delete();
                d("no_available_camera", "No cameras available for taking pictures.");
            }
        } catch (IOException e7) {
            throw new RuntimeException(e7);
        }
    }

    public final boolean l() {
        d dVar = this.f36226f;
        if (dVar == null) {
            return false;
        }
        Activity activity = (Activity) dVar.f36218b;
        try {
            PackageManager packageManager = activity.getPackageManager();
            return Arrays.asList((Build.VERSION.SDK_INT >= 33 ? packageManager.getPackageInfo(activity.getPackageName(), PackageManager.PackageInfoFlags.of(4096L)) : packageManager.getPackageInfo(activity.getPackageName(), 4096)).requestedPermissions).contains("android.permission.CAMERA");
        } catch (PackageManager.NameNotFoundException e3) {
            e3.printStackTrace();
            return false;
        }
    }

    public final boolean m(p pVar, v vVar, jh.b bVar) {
        synchronized (this.f36232m) {
            try {
                if (this.f36231l != null) {
                    return false;
                }
                this.f36231l = new x7.b(pVar, vVar, bVar);
                this.f36225e.f33853a.getSharedPreferences("flutter_image_picker_shared_preference", 0).edit().clear().apply();
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
