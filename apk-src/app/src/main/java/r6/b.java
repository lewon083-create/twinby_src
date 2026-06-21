package r6;

import android.database.Cursor;
import android.database.sqlite.SQLiteClosable;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteProgram;
import d8.k;
import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class b implements Closeable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String[] f32250d = new String[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f32251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SQLiteClosable f32252c;

    public /* synthetic */ b(SQLiteClosable sQLiteClosable, int i) {
        this.f32251b = i;
        this.f32252c = sQLiteClosable;
    }

    public void a(int i, byte[] bArr) {
        ((SQLiteProgram) this.f32252c).bindBlob(i, bArr);
    }

    public void b(int i, long j10) {
        ((SQLiteProgram) this.f32252c).bindLong(i, j10);
    }

    public void beginTransaction() {
        ((SQLiteDatabase) this.f32252c).beginTransaction();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f32251b) {
            case 0:
                ((SQLiteDatabase) this.f32252c).close();
                break;
            default:
                ((SQLiteProgram) this.f32252c).close();
                break;
        }
    }

    public void d(int i) {
        ((SQLiteProgram) this.f32252c).bindNull(i);
    }

    public void endTransaction() {
        ((SQLiteDatabase) this.f32252c).endTransaction();
    }

    public void execSQL(String str) {
        ((SQLiteDatabase) this.f32252c).execSQL(str);
    }

    public void h(int i, String str) {
        ((SQLiteProgram) this.f32252c).bindString(i, str);
    }

    public Cursor i(String str) {
        return j(new k(str, 2));
    }

    public Cursor j(q6.c cVar) {
        return ((SQLiteDatabase) this.f32252c).rawQueryWithFactory(new a(cVar), cVar.b(), f32250d, null);
    }

    public void setTransactionSuccessful() {
        ((SQLiteDatabase) this.f32252c).setTransactionSuccessful();
    }
}
