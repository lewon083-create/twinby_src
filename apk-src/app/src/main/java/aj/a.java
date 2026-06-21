package aj;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import t.t0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class a implements ei.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SharedPreferences f929b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g8.g f930c = new g8.g(4);

    public static void d(ii.f fVar, final a aVar) {
        t0 t0VarA = fVar.a();
        b bVar = b.f934b;
        s7.g gVar = new s7.g(fVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.remove", bVar, t0VarA);
        if (aVar != null) {
            final int i = 0;
            gVar.L(new ii.b(aVar) { // from class: aj.c

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ a f941c;

                {
                    this.f941c = aVar;
                }

                @Override // ii.b
                public final void q(Object obj, h3.e eVar) {
                    switch (i) {
                        case 0:
                            a aVar2 = this.f941c;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(aVar2.f929b.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th2) {
                                arrayList = i0.o.T(th2);
                            }
                            eVar.i(arrayList);
                            break;
                        case 1:
                            a aVar3 = this.f941c;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(aVar3.f929b.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th3) {
                                arrayList2 = i0.o.T(th3);
                            }
                            eVar.i(arrayList2);
                            break;
                        case 2:
                            a aVar4 = this.f941c;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, aVar4.c((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th4) {
                                arrayList4 = i0.o.T(th4);
                            }
                            eVar.i(arrayList4);
                            break;
                        case 3:
                            a aVar5 = this.f941c;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(aVar5.f929b.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th5) {
                                arrayList6 = i0.o.T(th5);
                            }
                            eVar.i(arrayList6);
                            break;
                        case 4:
                            a aVar6 = this.f941c;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d10 = (Double) arrayList9.get(1);
                            try {
                                aVar6.getClass();
                                String string = Double.toString(d10.doubleValue());
                                arrayList8.add(0, Boolean.valueOf(aVar6.f929b.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + string).commit()));
                            } catch (Throwable th6) {
                                arrayList8 = i0.o.T(th6);
                            }
                            eVar.i(arrayList8);
                            break;
                        case 5:
                            a aVar7 = this.f941c;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(aVar7.f929b.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th7) {
                                arrayList10 = i0.o.T(th7);
                            }
                            eVar.i(arrayList10);
                            break;
                        case 6:
                            a aVar8 = this.f941c;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, Boolean.valueOf(aVar8.f929b.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + aVar8.f930c.h(list)).commit()));
                            } catch (Throwable th8) {
                                arrayList12 = i0.o.T(th8);
                            }
                            eVar.i(arrayList12);
                            break;
                        case 7:
                            a aVar9 = this.f941c;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, aVar9.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th9) {
                                arrayList14 = i0.o.T(th9);
                            }
                            eVar.i(arrayList14);
                            break;
                        default:
                            a aVar10 = this.f941c;
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, aVar10.b((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th10) {
                                arrayList16 = i0.o.T(th10);
                            }
                            eVar.i(arrayList16);
                            break;
                    }
                }
            });
        } else {
            gVar.L(null);
        }
        s7.g gVar2 = new s7.g(fVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setBool", bVar, t0VarA);
        if (aVar != null) {
            final int i10 = 1;
            gVar2.L(new ii.b(aVar) { // from class: aj.c

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ a f941c;

                {
                    this.f941c = aVar;
                }

                @Override // ii.b
                public final void q(Object obj, h3.e eVar) {
                    switch (i10) {
                        case 0:
                            a aVar2 = this.f941c;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(aVar2.f929b.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th2) {
                                arrayList = i0.o.T(th2);
                            }
                            eVar.i(arrayList);
                            break;
                        case 1:
                            a aVar3 = this.f941c;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(aVar3.f929b.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th3) {
                                arrayList2 = i0.o.T(th3);
                            }
                            eVar.i(arrayList2);
                            break;
                        case 2:
                            a aVar4 = this.f941c;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, aVar4.c((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th4) {
                                arrayList4 = i0.o.T(th4);
                            }
                            eVar.i(arrayList4);
                            break;
                        case 3:
                            a aVar5 = this.f941c;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(aVar5.f929b.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th5) {
                                arrayList6 = i0.o.T(th5);
                            }
                            eVar.i(arrayList6);
                            break;
                        case 4:
                            a aVar6 = this.f941c;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d10 = (Double) arrayList9.get(1);
                            try {
                                aVar6.getClass();
                                String string = Double.toString(d10.doubleValue());
                                arrayList8.add(0, Boolean.valueOf(aVar6.f929b.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + string).commit()));
                            } catch (Throwable th6) {
                                arrayList8 = i0.o.T(th6);
                            }
                            eVar.i(arrayList8);
                            break;
                        case 5:
                            a aVar7 = this.f941c;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(aVar7.f929b.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th7) {
                                arrayList10 = i0.o.T(th7);
                            }
                            eVar.i(arrayList10);
                            break;
                        case 6:
                            a aVar8 = this.f941c;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, Boolean.valueOf(aVar8.f929b.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + aVar8.f930c.h(list)).commit()));
                            } catch (Throwable th8) {
                                arrayList12 = i0.o.T(th8);
                            }
                            eVar.i(arrayList12);
                            break;
                        case 7:
                            a aVar9 = this.f941c;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, aVar9.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th9) {
                                arrayList14 = i0.o.T(th9);
                            }
                            eVar.i(arrayList14);
                            break;
                        default:
                            a aVar10 = this.f941c;
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, aVar10.b((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th10) {
                                arrayList16 = i0.o.T(th10);
                            }
                            eVar.i(arrayList16);
                            break;
                    }
                }
            });
        } else {
            gVar2.L(null);
        }
        s7.g gVar3 = new s7.g(fVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setString", bVar, t0VarA);
        if (aVar != null) {
            final int i11 = 2;
            gVar3.L(new ii.b(aVar) { // from class: aj.c

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ a f941c;

                {
                    this.f941c = aVar;
                }

                @Override // ii.b
                public final void q(Object obj, h3.e eVar) {
                    switch (i11) {
                        case 0:
                            a aVar2 = this.f941c;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(aVar2.f929b.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th2) {
                                arrayList = i0.o.T(th2);
                            }
                            eVar.i(arrayList);
                            break;
                        case 1:
                            a aVar3 = this.f941c;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(aVar3.f929b.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th3) {
                                arrayList2 = i0.o.T(th3);
                            }
                            eVar.i(arrayList2);
                            break;
                        case 2:
                            a aVar4 = this.f941c;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, aVar4.c((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th4) {
                                arrayList4 = i0.o.T(th4);
                            }
                            eVar.i(arrayList4);
                            break;
                        case 3:
                            a aVar5 = this.f941c;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(aVar5.f929b.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th5) {
                                arrayList6 = i0.o.T(th5);
                            }
                            eVar.i(arrayList6);
                            break;
                        case 4:
                            a aVar6 = this.f941c;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d10 = (Double) arrayList9.get(1);
                            try {
                                aVar6.getClass();
                                String string = Double.toString(d10.doubleValue());
                                arrayList8.add(0, Boolean.valueOf(aVar6.f929b.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + string).commit()));
                            } catch (Throwable th6) {
                                arrayList8 = i0.o.T(th6);
                            }
                            eVar.i(arrayList8);
                            break;
                        case 5:
                            a aVar7 = this.f941c;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(aVar7.f929b.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th7) {
                                arrayList10 = i0.o.T(th7);
                            }
                            eVar.i(arrayList10);
                            break;
                        case 6:
                            a aVar8 = this.f941c;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, Boolean.valueOf(aVar8.f929b.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + aVar8.f930c.h(list)).commit()));
                            } catch (Throwable th8) {
                                arrayList12 = i0.o.T(th8);
                            }
                            eVar.i(arrayList12);
                            break;
                        case 7:
                            a aVar9 = this.f941c;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, aVar9.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th9) {
                                arrayList14 = i0.o.T(th9);
                            }
                            eVar.i(arrayList14);
                            break;
                        default:
                            a aVar10 = this.f941c;
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, aVar10.b((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th10) {
                                arrayList16 = i0.o.T(th10);
                            }
                            eVar.i(arrayList16);
                            break;
                    }
                }
            });
        } else {
            gVar3.L(null);
        }
        s7.g gVar4 = new s7.g(fVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setInt", bVar, t0VarA);
        if (aVar != null) {
            final int i12 = 3;
            gVar4.L(new ii.b(aVar) { // from class: aj.c

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ a f941c;

                {
                    this.f941c = aVar;
                }

                @Override // ii.b
                public final void q(Object obj, h3.e eVar) {
                    switch (i12) {
                        case 0:
                            a aVar2 = this.f941c;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(aVar2.f929b.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th2) {
                                arrayList = i0.o.T(th2);
                            }
                            eVar.i(arrayList);
                            break;
                        case 1:
                            a aVar3 = this.f941c;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(aVar3.f929b.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th3) {
                                arrayList2 = i0.o.T(th3);
                            }
                            eVar.i(arrayList2);
                            break;
                        case 2:
                            a aVar4 = this.f941c;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, aVar4.c((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th4) {
                                arrayList4 = i0.o.T(th4);
                            }
                            eVar.i(arrayList4);
                            break;
                        case 3:
                            a aVar5 = this.f941c;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(aVar5.f929b.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th5) {
                                arrayList6 = i0.o.T(th5);
                            }
                            eVar.i(arrayList6);
                            break;
                        case 4:
                            a aVar6 = this.f941c;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d10 = (Double) arrayList9.get(1);
                            try {
                                aVar6.getClass();
                                String string = Double.toString(d10.doubleValue());
                                arrayList8.add(0, Boolean.valueOf(aVar6.f929b.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + string).commit()));
                            } catch (Throwable th6) {
                                arrayList8 = i0.o.T(th6);
                            }
                            eVar.i(arrayList8);
                            break;
                        case 5:
                            a aVar7 = this.f941c;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(aVar7.f929b.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th7) {
                                arrayList10 = i0.o.T(th7);
                            }
                            eVar.i(arrayList10);
                            break;
                        case 6:
                            a aVar8 = this.f941c;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, Boolean.valueOf(aVar8.f929b.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + aVar8.f930c.h(list)).commit()));
                            } catch (Throwable th8) {
                                arrayList12 = i0.o.T(th8);
                            }
                            eVar.i(arrayList12);
                            break;
                        case 7:
                            a aVar9 = this.f941c;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, aVar9.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th9) {
                                arrayList14 = i0.o.T(th9);
                            }
                            eVar.i(arrayList14);
                            break;
                        default:
                            a aVar10 = this.f941c;
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, aVar10.b((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th10) {
                                arrayList16 = i0.o.T(th10);
                            }
                            eVar.i(arrayList16);
                            break;
                    }
                }
            });
        } else {
            gVar4.L(null);
        }
        s7.g gVar5 = new s7.g(fVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setDouble", bVar, t0VarA);
        if (aVar != null) {
            final int i13 = 4;
            gVar5.L(new ii.b(aVar) { // from class: aj.c

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ a f941c;

                {
                    this.f941c = aVar;
                }

                @Override // ii.b
                public final void q(Object obj, h3.e eVar) {
                    switch (i13) {
                        case 0:
                            a aVar2 = this.f941c;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(aVar2.f929b.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th2) {
                                arrayList = i0.o.T(th2);
                            }
                            eVar.i(arrayList);
                            break;
                        case 1:
                            a aVar3 = this.f941c;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(aVar3.f929b.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th3) {
                                arrayList2 = i0.o.T(th3);
                            }
                            eVar.i(arrayList2);
                            break;
                        case 2:
                            a aVar4 = this.f941c;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, aVar4.c((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th4) {
                                arrayList4 = i0.o.T(th4);
                            }
                            eVar.i(arrayList4);
                            break;
                        case 3:
                            a aVar5 = this.f941c;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(aVar5.f929b.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th5) {
                                arrayList6 = i0.o.T(th5);
                            }
                            eVar.i(arrayList6);
                            break;
                        case 4:
                            a aVar6 = this.f941c;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d10 = (Double) arrayList9.get(1);
                            try {
                                aVar6.getClass();
                                String string = Double.toString(d10.doubleValue());
                                arrayList8.add(0, Boolean.valueOf(aVar6.f929b.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + string).commit()));
                            } catch (Throwable th6) {
                                arrayList8 = i0.o.T(th6);
                            }
                            eVar.i(arrayList8);
                            break;
                        case 5:
                            a aVar7 = this.f941c;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(aVar7.f929b.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th7) {
                                arrayList10 = i0.o.T(th7);
                            }
                            eVar.i(arrayList10);
                            break;
                        case 6:
                            a aVar8 = this.f941c;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, Boolean.valueOf(aVar8.f929b.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + aVar8.f930c.h(list)).commit()));
                            } catch (Throwable th8) {
                                arrayList12 = i0.o.T(th8);
                            }
                            eVar.i(arrayList12);
                            break;
                        case 7:
                            a aVar9 = this.f941c;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, aVar9.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th9) {
                                arrayList14 = i0.o.T(th9);
                            }
                            eVar.i(arrayList14);
                            break;
                        default:
                            a aVar10 = this.f941c;
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, aVar10.b((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th10) {
                                arrayList16 = i0.o.T(th10);
                            }
                            eVar.i(arrayList16);
                            break;
                    }
                }
            });
        } else {
            gVar5.L(null);
        }
        s7.g gVar6 = new s7.g(fVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setEncodedStringList", bVar, t0VarA);
        if (aVar != null) {
            final int i14 = 5;
            gVar6.L(new ii.b(aVar) { // from class: aj.c

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ a f941c;

                {
                    this.f941c = aVar;
                }

                @Override // ii.b
                public final void q(Object obj, h3.e eVar) {
                    switch (i14) {
                        case 0:
                            a aVar2 = this.f941c;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(aVar2.f929b.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th2) {
                                arrayList = i0.o.T(th2);
                            }
                            eVar.i(arrayList);
                            break;
                        case 1:
                            a aVar3 = this.f941c;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(aVar3.f929b.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th3) {
                                arrayList2 = i0.o.T(th3);
                            }
                            eVar.i(arrayList2);
                            break;
                        case 2:
                            a aVar4 = this.f941c;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, aVar4.c((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th4) {
                                arrayList4 = i0.o.T(th4);
                            }
                            eVar.i(arrayList4);
                            break;
                        case 3:
                            a aVar5 = this.f941c;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(aVar5.f929b.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th5) {
                                arrayList6 = i0.o.T(th5);
                            }
                            eVar.i(arrayList6);
                            break;
                        case 4:
                            a aVar6 = this.f941c;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d10 = (Double) arrayList9.get(1);
                            try {
                                aVar6.getClass();
                                String string = Double.toString(d10.doubleValue());
                                arrayList8.add(0, Boolean.valueOf(aVar6.f929b.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + string).commit()));
                            } catch (Throwable th6) {
                                arrayList8 = i0.o.T(th6);
                            }
                            eVar.i(arrayList8);
                            break;
                        case 5:
                            a aVar7 = this.f941c;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(aVar7.f929b.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th7) {
                                arrayList10 = i0.o.T(th7);
                            }
                            eVar.i(arrayList10);
                            break;
                        case 6:
                            a aVar8 = this.f941c;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, Boolean.valueOf(aVar8.f929b.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + aVar8.f930c.h(list)).commit()));
                            } catch (Throwable th8) {
                                arrayList12 = i0.o.T(th8);
                            }
                            eVar.i(arrayList12);
                            break;
                        case 7:
                            a aVar9 = this.f941c;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, aVar9.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th9) {
                                arrayList14 = i0.o.T(th9);
                            }
                            eVar.i(arrayList14);
                            break;
                        default:
                            a aVar10 = this.f941c;
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, aVar10.b((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th10) {
                                arrayList16 = i0.o.T(th10);
                            }
                            eVar.i(arrayList16);
                            break;
                    }
                }
            });
        } else {
            gVar6.L(null);
        }
        s7.g gVar7 = new s7.g(fVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setDeprecatedStringList", bVar, t0VarA);
        if (aVar != null) {
            final int i15 = 6;
            gVar7.L(new ii.b(aVar) { // from class: aj.c

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ a f941c;

                {
                    this.f941c = aVar;
                }

                @Override // ii.b
                public final void q(Object obj, h3.e eVar) {
                    switch (i15) {
                        case 0:
                            a aVar2 = this.f941c;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(aVar2.f929b.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th2) {
                                arrayList = i0.o.T(th2);
                            }
                            eVar.i(arrayList);
                            break;
                        case 1:
                            a aVar3 = this.f941c;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(aVar3.f929b.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th3) {
                                arrayList2 = i0.o.T(th3);
                            }
                            eVar.i(arrayList2);
                            break;
                        case 2:
                            a aVar4 = this.f941c;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, aVar4.c((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th4) {
                                arrayList4 = i0.o.T(th4);
                            }
                            eVar.i(arrayList4);
                            break;
                        case 3:
                            a aVar5 = this.f941c;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(aVar5.f929b.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th5) {
                                arrayList6 = i0.o.T(th5);
                            }
                            eVar.i(arrayList6);
                            break;
                        case 4:
                            a aVar6 = this.f941c;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d10 = (Double) arrayList9.get(1);
                            try {
                                aVar6.getClass();
                                String string = Double.toString(d10.doubleValue());
                                arrayList8.add(0, Boolean.valueOf(aVar6.f929b.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + string).commit()));
                            } catch (Throwable th6) {
                                arrayList8 = i0.o.T(th6);
                            }
                            eVar.i(arrayList8);
                            break;
                        case 5:
                            a aVar7 = this.f941c;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(aVar7.f929b.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th7) {
                                arrayList10 = i0.o.T(th7);
                            }
                            eVar.i(arrayList10);
                            break;
                        case 6:
                            a aVar8 = this.f941c;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, Boolean.valueOf(aVar8.f929b.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + aVar8.f930c.h(list)).commit()));
                            } catch (Throwable th8) {
                                arrayList12 = i0.o.T(th8);
                            }
                            eVar.i(arrayList12);
                            break;
                        case 7:
                            a aVar9 = this.f941c;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, aVar9.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th9) {
                                arrayList14 = i0.o.T(th9);
                            }
                            eVar.i(arrayList14);
                            break;
                        default:
                            a aVar10 = this.f941c;
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, aVar10.b((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th10) {
                                arrayList16 = i0.o.T(th10);
                            }
                            eVar.i(arrayList16);
                            break;
                    }
                }
            });
        } else {
            gVar7.L(null);
        }
        s7.g gVar8 = new s7.g(fVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.clear", bVar, t0VarA);
        if (aVar != null) {
            final int i16 = 7;
            gVar8.L(new ii.b(aVar) { // from class: aj.c

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ a f941c;

                {
                    this.f941c = aVar;
                }

                @Override // ii.b
                public final void q(Object obj, h3.e eVar) {
                    switch (i16) {
                        case 0:
                            a aVar2 = this.f941c;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(aVar2.f929b.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th2) {
                                arrayList = i0.o.T(th2);
                            }
                            eVar.i(arrayList);
                            break;
                        case 1:
                            a aVar3 = this.f941c;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(aVar3.f929b.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th3) {
                                arrayList2 = i0.o.T(th3);
                            }
                            eVar.i(arrayList2);
                            break;
                        case 2:
                            a aVar4 = this.f941c;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, aVar4.c((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th4) {
                                arrayList4 = i0.o.T(th4);
                            }
                            eVar.i(arrayList4);
                            break;
                        case 3:
                            a aVar5 = this.f941c;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(aVar5.f929b.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th5) {
                                arrayList6 = i0.o.T(th5);
                            }
                            eVar.i(arrayList6);
                            break;
                        case 4:
                            a aVar6 = this.f941c;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d10 = (Double) arrayList9.get(1);
                            try {
                                aVar6.getClass();
                                String string = Double.toString(d10.doubleValue());
                                arrayList8.add(0, Boolean.valueOf(aVar6.f929b.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + string).commit()));
                            } catch (Throwable th6) {
                                arrayList8 = i0.o.T(th6);
                            }
                            eVar.i(arrayList8);
                            break;
                        case 5:
                            a aVar7 = this.f941c;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(aVar7.f929b.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th7) {
                                arrayList10 = i0.o.T(th7);
                            }
                            eVar.i(arrayList10);
                            break;
                        case 6:
                            a aVar8 = this.f941c;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, Boolean.valueOf(aVar8.f929b.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + aVar8.f930c.h(list)).commit()));
                            } catch (Throwable th8) {
                                arrayList12 = i0.o.T(th8);
                            }
                            eVar.i(arrayList12);
                            break;
                        case 7:
                            a aVar9 = this.f941c;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, aVar9.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th9) {
                                arrayList14 = i0.o.T(th9);
                            }
                            eVar.i(arrayList14);
                            break;
                        default:
                            a aVar10 = this.f941c;
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, aVar10.b((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th10) {
                                arrayList16 = i0.o.T(th10);
                            }
                            eVar.i(arrayList16);
                            break;
                    }
                }
            });
        } else {
            gVar8.L(null);
        }
        s7.g gVar9 = new s7.g(fVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.getAll", bVar, t0VarA);
        if (aVar == null) {
            gVar9.L(null);
        } else {
            final int i17 = 8;
            gVar9.L(new ii.b(aVar) { // from class: aj.c

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ a f941c;

                {
                    this.f941c = aVar;
                }

                @Override // ii.b
                public final void q(Object obj, h3.e eVar) {
                    switch (i17) {
                        case 0:
                            a aVar2 = this.f941c;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(aVar2.f929b.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th2) {
                                arrayList = i0.o.T(th2);
                            }
                            eVar.i(arrayList);
                            break;
                        case 1:
                            a aVar3 = this.f941c;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(aVar3.f929b.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th3) {
                                arrayList2 = i0.o.T(th3);
                            }
                            eVar.i(arrayList2);
                            break;
                        case 2:
                            a aVar4 = this.f941c;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, aVar4.c((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th4) {
                                arrayList4 = i0.o.T(th4);
                            }
                            eVar.i(arrayList4);
                            break;
                        case 3:
                            a aVar5 = this.f941c;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(aVar5.f929b.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th5) {
                                arrayList6 = i0.o.T(th5);
                            }
                            eVar.i(arrayList6);
                            break;
                        case 4:
                            a aVar6 = this.f941c;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d10 = (Double) arrayList9.get(1);
                            try {
                                aVar6.getClass();
                                String string = Double.toString(d10.doubleValue());
                                arrayList8.add(0, Boolean.valueOf(aVar6.f929b.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + string).commit()));
                            } catch (Throwable th6) {
                                arrayList8 = i0.o.T(th6);
                            }
                            eVar.i(arrayList8);
                            break;
                        case 5:
                            a aVar7 = this.f941c;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(aVar7.f929b.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th7) {
                                arrayList10 = i0.o.T(th7);
                            }
                            eVar.i(arrayList10);
                            break;
                        case 6:
                            a aVar8 = this.f941c;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, Boolean.valueOf(aVar8.f929b.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + aVar8.f930c.h(list)).commit()));
                            } catch (Throwable th8) {
                                arrayList12 = i0.o.T(th8);
                            }
                            eVar.i(arrayList12);
                            break;
                        case 7:
                            a aVar9 = this.f941c;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, aVar9.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th9) {
                                arrayList14 = i0.o.T(th9);
                            }
                            eVar.i(arrayList14);
                            break;
                        default:
                            a aVar10 = this.f941c;
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, aVar10.b((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th10) {
                                arrayList16 = i0.o.T(th10);
                            }
                            eVar.i(arrayList16);
                            break;
                    }
                }
            });
        }
    }

    public final Boolean a(String str, List list) {
        SharedPreferences.Editor editorEdit = this.f929b.edit();
        Map<String, ?> all = this.f929b.getAll();
        ArrayList arrayList = new ArrayList();
        for (String str2 : all.keySet()) {
            if (str2.startsWith(str) && (list == null || list.contains(str2))) {
                arrayList.add(str2);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            editorEdit.remove((String) it.next());
        }
        return Boolean.valueOf(editorEdit.commit());
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final HashMap b(String str, List list) {
        Object bigInteger;
        Object objValueOf;
        Set hashSet = list == null ? null : new HashSet(list);
        Map<String, ?> all = this.f929b.getAll();
        HashMap map = new HashMap();
        for (String str2 : all.keySet()) {
            if (str2.startsWith(str) && (hashSet == null || hashSet.contains(str2))) {
                Object obj = all.get(str2);
                Objects.requireNonNull(obj);
                boolean z5 = obj instanceof String;
                g8.g gVar = this.f930c;
                if (z5) {
                    String str3 = (String) obj;
                    if (str3.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu")) {
                        objValueOf = obj;
                        if (!str3.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!")) {
                            String strSubstring = str3.substring(40);
                            gVar.getClass();
                            try {
                                ByteArrayInputStream input = new ByteArrayInputStream(Base64.decode(strSubstring, 0));
                                Intrinsics.checkNotNullParameter(input, "input");
                                objValueOf = (List) new h0(input).readObject();
                            } catch (IOException | ClassNotFoundException e3) {
                                throw new RuntimeException(e3);
                            }
                        }
                    } else if (str3.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBCaWdJbnRlZ2Vy")) {
                        bigInteger = new BigInteger(str3.substring(44), 36);
                        objValueOf = bigInteger;
                    } else {
                        objValueOf = obj;
                        if (str3.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu")) {
                            objValueOf = Double.valueOf(str3.substring(40));
                        }
                    }
                    map.put(str2, objValueOf);
                } else {
                    boolean z10 = obj instanceof Set;
                    objValueOf = obj;
                    if (z10) {
                        ArrayList arrayList = new ArrayList((Set) obj);
                        this.f929b.edit().remove(str2).putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + gVar.h(arrayList)).apply();
                        bigInteger = arrayList;
                        objValueOf = bigInteger;
                    }
                    map.put(str2, objValueOf);
                }
            }
        }
        return map;
    }

    public final Boolean c(String str, String str2) {
        if (str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu") || str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBCaWdJbnRlZ2Vy") || str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu")) {
            throw new RuntimeException("StorageError: This string cannot be stored as it clashes with special identifier prefixes");
        }
        return Boolean.valueOf(this.f929b.edit().putString(str, str2).commit());
    }

    @Override // ei.b
    public final void onAttachedToEngine(ei.a aVar) {
        ii.f fVar = aVar.f16383c;
        this.f929b = aVar.f16381a.getSharedPreferences("FlutterSharedPreferences", 0);
        try {
            d(fVar, this);
        } catch (Exception e3) {
            Log.e("SharedPreferencesPlugin", "Received exception while setting up SharedPreferencesPlugin", e3);
        }
    }

    @Override // ei.b
    public final void onDetachedFromEngine(ei.a aVar) {
        d(aVar.f16383c, null);
    }
}
