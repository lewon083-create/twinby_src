package n6;

import android.database.Cursor;
import io.sentry.Session;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f29158b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f29159c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set f29160d;

    public e(String str, HashMap map, HashSet hashSet, HashSet hashSet2) {
        this.f29157a = str;
        this.f29158b = Collections.unmodifiableMap(map);
        this.f29159c = Collections.unmodifiableSet(hashSet);
        this.f29160d = hashSet2 == null ? null : Collections.unmodifiableSet(hashSet2);
    }

    public static e a(r6.b bVar, String str) {
        int i;
        int i10;
        int i11;
        ArrayList arrayList;
        Cursor cursorI = bVar.i(pe.a.f("PRAGMA table_info(`", str, "`)"));
        HashMap map = new HashMap();
        try {
            if (cursorI.getColumnCount() > 0) {
                int columnIndex = cursorI.getColumnIndex("name");
                int columnIndex2 = cursorI.getColumnIndex("type");
                int columnIndex3 = cursorI.getColumnIndex("notnull");
                int columnIndex4 = cursorI.getColumnIndex("pk");
                int columnIndex5 = cursorI.getColumnIndex("dflt_value");
                while (cursorI.moveToNext()) {
                    String string = cursorI.getString(columnIndex);
                    map.put(string, new a(cursorI.getInt(columnIndex4), string, cursorI.getString(columnIndex2), cursorI.getString(columnIndex5), cursorI.getInt(columnIndex3) != 0, 2));
                }
            }
            cursorI.close();
            HashSet hashSet = new HashSet();
            cursorI = bVar.i("PRAGMA foreign_key_list(`" + str + "`)");
            try {
                int columnIndex6 = cursorI.getColumnIndex("id");
                int columnIndex7 = cursorI.getColumnIndex(Session.JsonKeys.SEQ);
                int columnIndex8 = cursorI.getColumnIndex("table");
                int columnIndex9 = cursorI.getColumnIndex("on_delete");
                int columnIndex10 = cursorI.getColumnIndex("on_update");
                ArrayList<c> arrayListB = b(cursorI);
                int count = cursorI.getCount();
                int i12 = 0;
                while (i12 < count) {
                    cursorI.moveToPosition(i12);
                    if (cursorI.getInt(columnIndex7) != 0) {
                        i = i12;
                        i10 = columnIndex6;
                        i11 = columnIndex7;
                        arrayList = arrayListB;
                    } else {
                        int i13 = cursorI.getInt(columnIndex6);
                        i = i12;
                        ArrayList arrayList2 = new ArrayList();
                        i10 = columnIndex6;
                        ArrayList arrayList3 = new ArrayList();
                        for (c cVar : arrayListB) {
                            int i14 = columnIndex7;
                            ArrayList arrayList4 = arrayListB;
                            if (cVar.f29150b == i13) {
                                arrayList2.add(cVar.f29152d);
                                arrayList3.add(cVar.f29153e);
                            }
                            columnIndex7 = i14;
                            arrayListB = arrayList4;
                        }
                        i11 = columnIndex7;
                        arrayList = arrayListB;
                        hashSet.add(new b(cursorI.getString(columnIndex8), cursorI.getString(columnIndex9), cursorI.getString(columnIndex10), arrayList2, arrayList3));
                    }
                    i12 = i + 1;
                    columnIndex6 = i10;
                    columnIndex7 = i11;
                    arrayListB = arrayList;
                }
                cursorI.close();
                cursorI = bVar.i("PRAGMA index_list(`" + str + "`)");
                try {
                    int columnIndex11 = cursorI.getColumnIndex("name");
                    int columnIndex12 = cursorI.getColumnIndex("origin");
                    int columnIndex13 = cursorI.getColumnIndex("unique");
                    HashSet hashSet2 = null;
                    if (columnIndex11 == -1 || columnIndex12 == -1 || columnIndex13 == -1) {
                        break;
                    }
                    HashSet hashSet3 = new HashSet();
                    while (cursorI.moveToNext()) {
                        if ("c".equals(cursorI.getString(columnIndex12))) {
                            d dVarC = c(bVar, cursorI.getString(columnIndex11), cursorI.getInt(columnIndex13) == 1);
                            if (dVarC == null) {
                                break;
                            }
                            hashSet3.add(dVarC);
                        }
                    }
                    cursorI.close();
                    hashSet2 = hashSet3;
                    return new e(str, map, hashSet, hashSet2);
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    public static ArrayList b(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex(Session.JsonKeys.SEQ);
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        int count = cursor.getCount();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < count; i++) {
            cursor.moveToPosition(i);
            arrayList.add(new c(cursor.getInt(columnIndex), cursor.getInt(columnIndex2), cursor.getString(columnIndex3), cursor.getString(columnIndex4)));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* JADX WARN: Finally extract failed */
    public static d c(r6.b bVar, String str, boolean z5) {
        Cursor cursorI = bVar.i(pe.a.f("PRAGMA index_xinfo(`", str, "`)"));
        try {
            int columnIndex = cursorI.getColumnIndex("seqno");
            int columnIndex2 = cursorI.getColumnIndex("cid");
            int columnIndex3 = cursorI.getColumnIndex("name");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                TreeMap treeMap = new TreeMap();
                while (cursorI.moveToNext()) {
                    if (cursorI.getInt(columnIndex2) >= 0) {
                        int i = cursorI.getInt(columnIndex);
                        treeMap.put(Integer.valueOf(i), cursorI.getString(columnIndex3));
                    }
                }
                ArrayList arrayList = new ArrayList(treeMap.size());
                arrayList.addAll(treeMap.values());
                d dVar = new d(str, arrayList, z5);
                cursorI.close();
                return dVar;
            }
            cursorI.close();
            return null;
        } catch (Throwable th2) {
            cursorI.close();
            throw th2;
        }
    }

    public final boolean equals(Object obj) {
        Set set;
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        Set set2 = eVar.f29159c;
        Map map = eVar.f29158b;
        String str = eVar.f29157a;
        String str2 = this.f29157a;
        if (str2 == null ? str != null : !str2.equals(str)) {
            return false;
        }
        Map map2 = this.f29158b;
        if (map2 == null ? map != null : !map2.equals(map)) {
            return false;
        }
        Set set3 = this.f29159c;
        if (set3 == null ? set2 != null : !set3.equals(set2)) {
            return false;
        }
        Set set4 = this.f29160d;
        if (set4 == null || (set = eVar.f29160d) == null) {
            return true;
        }
        return set4.equals(set);
    }

    public final int hashCode() {
        String str = this.f29157a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        Map map = this.f29158b;
        int iHashCode2 = (iHashCode + (map != null ? map.hashCode() : 0)) * 31;
        Set set = this.f29159c;
        return iHashCode2 + (set != null ? set.hashCode() : 0);
    }

    public final String toString() {
        return "TableInfo{name='" + this.f29157a + "', columns=" + this.f29158b + ", foreignKeys=" + this.f29159c + ", indices=" + this.f29160d + '}';
    }
}
