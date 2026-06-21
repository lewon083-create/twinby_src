package fh;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.template.Field;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class g7 implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sy f17259a;

    public g7(sy syVar) {
        this.f17259a = syVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    public final Object resolve(ParsingContext parsingContext, EntityTemplate entityTemplate, Object obj) {
        Field field = ((h7) entityTemplate).f17329a;
        sy syVar = this.f17259a;
        JsonFieldResolver.resolveList(parsingContext, field, (JSONObject) obj, "items", syVar.B1, syVar.z1, j6.f17461b);
        return new wd.d();
    }
}
