package fh;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.template.Field;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class fb implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sy f17193a;

    public fb(sy syVar) {
        this.f17193a = syVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    public final Object resolve(ParsingContext parsingContext, EntityTemplate entityTemplate, Object obj) {
        Field field = ((hb) entityTemplate).f17334a;
        sy syVar = this.f17193a;
        if (((cd) JsonFieldResolver.resolveOptional(parsingContext, field, (JSONObject) obj, "space_between_centers", syVar.f18575x3, syVar.f18554v3)) == null) {
            int i = gb.f17265a;
        }
        return new cb();
    }
}
