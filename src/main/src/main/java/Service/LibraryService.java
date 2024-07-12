public class LibraryService {
    private final LibraryRepository libraryRepository;

    public LibraryService(LibraryRepository libraryRepository) {
        this.libraryRepository = libraryRepository;
    }

    public List<Library> findAllLibraries() {
        return libraryRepository.findAll();
    }

    public Library findLibraryById(Long id) {
        return libraryRepository.findById(id);
    }

    public void addLibrary(Library library) {
        libraryRepository.save(library);
    }
}
