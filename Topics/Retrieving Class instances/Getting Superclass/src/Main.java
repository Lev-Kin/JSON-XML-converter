
class SuperClassGetter {

    public Class getSuperClassByName(String name) throws ClassNotFoundException {
        Class clazz = Class.forName(name);
        return clazz.getSuperclass();
    }

    public Class getSuperClassByInstance(Object object) {
        return object.getClass().getSuperclass();
    }
}